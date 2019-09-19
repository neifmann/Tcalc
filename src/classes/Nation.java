package classes;

import java.util.HashMap;

public class Nation {
    private HashMap<String,ShipClass> classList;

    public Nation () {
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
