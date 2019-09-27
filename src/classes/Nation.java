package classes;

import java.util.HashMap;

public class Nation {
    private HashMap<String,ShipClass> classList;
    private Integer num;
    private String name;

    public Nation () {
    }

    public Nation (String nationName, Integer nationIterator) {
        this.name = nationName;
        nationIterator = nationIterator + 1;
        this.num = nationIterator;
    }

    public void AddClassByName(String className){
        if (!this.classList.containsKey(className)) {
            ShipClass shipClass = new ShipClass();
            this.classList.put(className, shipClass);
        }
    }

    public ShipClass GetClassByName(String className){
        return this.classList.get(className);
    }

    public HashMap <String,ShipClass> GetNation(){
        return this.classList;
    }
}
