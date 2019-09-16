package classes;

import java.util.HashMap;

public class Nation {
    private HashMap<String,ShipClass> classList;

    public void Nation () {
    }

    public void AddClassByName(String className){
        ShipClass shipClass = new ShipClass();
        this.classList.put(className, shipClass);
    }

    public ShipClass GetShipClassByName(String className){
        return this.classList.get(className);
    }
}
