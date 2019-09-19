package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Data2 {
    private HashMap<String,Object> data2;

    public Data2(){

    }

    public void Data2Read(Data data) throws IOException {
        File f = new File("src/data/data.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        String readLine = "";

        while ((readLine = b.readLine()) != null) {
            String[] s = readLine.split(" ");
            Ship ship = new Ship(s[0],s[1],s[2],s[3]);
        }
    }
}