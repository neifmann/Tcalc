package classes;

import java.util.HashMap;

public class ShipClass {
    private HashMap<String,ShipLvl> lvlList;

    public ShipClass(){

    }

    public void AddLvlByNum(String lvlNum){
        if (!this.lvlList.containsKey(lvlNum)) {
            ShipLvl shipLvl = new ShipLvl();
            this.lvlList.put(lvlNum, shipLvl);
        }
    }

    public ShipLvl GetLvlByNum(String lvlNum){
        return this.lvlList.get(lvlNum);
    }

    public HashMap <String, ShipLvl> getShipClass() {
        return this.lvlList;
    }
}
