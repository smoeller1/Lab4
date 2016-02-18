/**
 * Created by Mayanka on 03-Sep-15.
 */
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    public void reduce(Text text, Iterable<String> keys, Context context) throws IOException, InterruptedException {

        for (String key : keys) {
            for (String value : key) {
                /* Got to look through each pair of friends, and find the number of friends who are the same in each
                friend list
                 */
            }
        }
        context.write(text, new IntWritable(sum));
    }
}