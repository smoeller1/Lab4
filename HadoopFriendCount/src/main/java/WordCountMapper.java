/**
 * Created by Mayanka on 03-Sep-15.
 */
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<Object, Text, Text, IntWritable> {

    private Text keyUser = new Text();
    private Text keyValue = new Text();

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {

        /* value is defined as:
        ThisUser:Friend1,Friend2,...,FriendN
         */
        String[] tmp = value.toString().split(":");
        keyUser.set(tmp[0]);
        String[] friends = tmp[1].toString().split(",");
        for (String friend : friends) {
            keyValue.set(friend);
            context.write(keyUser, keyValue);
        }
    }
}
