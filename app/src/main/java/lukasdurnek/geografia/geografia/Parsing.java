package lukasdurnek.geografia.geografia;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 * Created by Lukas on 24. 2. 2015.
 */
public class Parsing {
    private static Stat [] staty;

    public static void main(String [] args) throws FileNotFoundException{
        staty = new Stat [200];
        parse();
    }

    public static void parse() throws FileNotFoundException{
        Scanner scn = new Scanner(new FileReader("@data/zoznamStatov.txt"));
        String phrase;
        int i = 0;

        System.out.println("Start parsing...");

        while (scn.hasNext()){
            phrase = scn.nextLine();
            String [] atributes = phrase.split(";");

            staty[i++] = new Stat(atributes[0], atributes[1], atributes[2], atributes[3], atributes[4],
                    atributes[5], atributes[6], atributes[7]);
        }

        System.out.println("Parsing finished...");
    }
}
