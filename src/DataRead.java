import classes.Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class DataRead {

    public void NationsRead(Data data) throws IOException {
        File f = new File("src/data/nations.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {
            data.AddNationByName(readLine);
        }
    }

    public void ClassRead(Data data) throws IOException {

        File f = new File("src/data/type.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {
            data.GetData().forEach((k,v)->{v.AddClassByName(readLine)});
        }
    }

    public void ShipsRead() throws IOException {
        File f = new File("src/data/data.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {

        }
    }
}
