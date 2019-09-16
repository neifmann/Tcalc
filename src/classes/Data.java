package classes;

import java.util.HashMap;

public class Data {
    private HashMap<String,Nation> DataMap;

    public void Data(){
    }

    public void AddNationByName(String nationName){
        Nation nation = new Nation();
        this.DataMap.put(nationName, nation);
    }

    public Nation GetNationByName(String nationName){
        return this.DataMap.get(nationName);
    }
}
