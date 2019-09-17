package classes;

import java.util.HashMap;

public class Data {
    private HashMap<String,Nation> dataMap;

    public Data (){
    }

    public void AddNationByName(String nationName){
        if (!this.dataMap.containsKey(nationName)) {
            Nation nation = new Nation();
            this.dataMap.put(nationName, nation);
        }
    }

    public Nation GetNationByName(String nationName){
        return this.dataMap.get(nationName);
    }

    public HashMap GetData(){
        return this.dataMap;
    }
}