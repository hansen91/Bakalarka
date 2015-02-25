package lukasdurnek.geografia.geografia;
import android.os.Environment;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;


/**
 * Created by Lukas on 23. 2. 2015.
 */
public class StatInfo {

    public static void main(String[] args) throws IOException{
        try {
            File moj = new File("~/main/zoznamStatov.txt");
            FileInputStream stream = new FileInputStream(moj);
            String jsonStr = null;
            try {
                FileChannel fc = stream.getChannel();
                MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());

                jsonStr = Charset.defaultCharset().decode(bb).toString();
            }
            finally {
                stream.close();
            }
            JSONObject jsonObj = new JSONObject(jsonStr);

            // Getting data JSON Array nodes
            JSONArray data  = jsonObj.getJSONArray("data");

            // looping through All nodes
            for (int i = 0; i < data.length(); i++) {
                JSONObject c = data.getJSONObject(i);

                String stat = c.getString("stat");
                String kontinent = c.getString("kontinent");
                String hlMesto = c.getString("hlMesto");
                String rozloha = c.getString("rozloha");
                String obyvatelia = c.getString("obyvatelia");
                String mesta = c.getString("mesta");
                String jazyky = c.getString("jazyky");
                String mena = c.getString("mena");

                //use >  int id = c.getInt("duration"); if you want get an int


                // tmp hashmap for single node
                HashMap<String, String> parsedData = new HashMap<String, String>();

                // adding each child node to HashMap key => value
                parsedData.put(";", stat);
                parsedData.put(";", kontinent);
                parsedData.put(";", hlMesto);
                parsedData.put(";", rozloha);
                parsedData.put(";",obyvatelia);
                parsedData.put(";",mesta);
                parsedData.put(";",jazyky);
                parsedData.put(";",mena);



                // do what do you want on your interface
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
