package classes;

import java.util.HashMap;

public class Ships {
    private HashMap <String,Ship> ships;

    public Ships(){

    }

    public void AddShipByName(String shipName, Ship ship){
        if (!this.ships.containsKey(shipName)) {
            Ship Ship = new Ship();
        }

        this.ships.put(shipName, ship);
    }

    public Ship GetShipByName(String shipName){
        return this.ships.get(shipName);
    }

    public HashMap <String, Ship> getShipLvl() {
        return this.ships;
    }
}
