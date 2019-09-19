package classes;

import java.util.HashMap;

public class ShipLvl {
    private HashMap<String,Ship> shipList;

    public ShipLvl(){

    }

    public void AddShipByName(String shipName, Ship ship){
        if (!this.shipList.containsKey(shipName)) {
            Ship Ship = new Ship();
        }

        this.shipList.put(shipName, ship);
    }

    public Ship GetShipByName(String shipName){
        return this.shipList.get(shipName);
    }

    public HashMap <String, Ship> getShipLvl() {
        return this.shipList;
    }
}
