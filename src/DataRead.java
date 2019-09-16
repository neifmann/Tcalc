import classes.Ship;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DataRead {

    public void TypeRead() throws IOException {

        File f = new File("src/data/type.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {

        }
    }

    public void NationsRead() throws IOException {
        File f = new File("src/data/nations.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {

        }
    }

    public void DataRead() throws IOException {
        File f = new File("src/data/data.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {

        }
    }
}
