import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class DataRead {

    public static void main(String[]args) throws IOException {

        try {

            File f = new File("src/data/nations.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";

            while ((readLine = b.readLine()) != null) {
                HashMap() = new HashMap(toSrring(readLine));

            }

            File f = new File("src/data/data.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            String readLine = "";
            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                String delimeter = " ";
                String[] subStr = readLine.split(delimeter);

                if (subStr.length == 5) {
                    Ship ship = new Ship(subStr[0],subStr[1],subStr[2],subStr[3],subStr[4]);
                    if (null != (HashMap) subStr[0]) {



                    }


                } else { System.out.println("ошибка"); }

                for (int i = 0; i < subStr.length; i++) {
                    System.out.println(subStr[i]);
                }

            }








            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
