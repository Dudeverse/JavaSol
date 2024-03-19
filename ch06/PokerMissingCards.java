import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class PokerMissingCards {
    public static class PokerMapper extends Mapper<Object, Text, Text, NullWritable> {
        private Text card = new Text();

        public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
            String[] tokens = value.toString().split(",");
            if (tokens.length == 2) {
                String rank = tokens[0].trim();
                String suit = tokens[1].trim();
                card.set(rank + suit); // RankSuit
                context.write(card, NullWritable.get());
            }
        }
    }

    public static class PokerReducer extends Reducer<Text, NullWritable, Text, NullWritable> {
        private static final String[] SUITS = { "Heart", "Diamond", "Club", "Spade" };
        private static final String[] RANKS = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };

        private Set<String> presentCards = new HashSet<>(); // Moved outside the reduce method

        public void reduce(Text key, Iterable<NullWritable> values, Context context)
                throws IOException, InterruptedException {
            // Add the card to the presentCards set only once
            presentCards.add(key.toString());
        }
        public void cleanup(Context context) throws IOException, InterruptedException {
        	boolean missingCardFound = false;
        	
            for (String suit : SUITS) {
                for (String rank : RANKS) {
                    String fullCard = suit + rank;
                    if (!presentCards.contains(fullCard)) {
                        context.write(new Text(suit + "\t" + rank), NullWritable.get());
                        missingCardFound = true;
                    }
                }
            }
            
            if (!missingCardFound) {
                context.write(new Text("No missing cards found"), NullWritable.get());
            }
        }
    }



    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Poker Missing Cards");
        job.setJarByClass(PokerMissingCards.class);
        job.setMapperClass(PokerMapper.class);
        job.setReducerClass(PokerReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(NullWritable.class);
        job.setOutputFormatClass(TextOutputFormat.class); // Set output format to text
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
