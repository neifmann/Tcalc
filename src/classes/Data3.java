package classes;

import java.lang.reflect.Array;
import java.util.HashMap;

public class Data3 {
    private HashMap<String,String>[][][] shipArray;

    public Data3(){

    }

    public Data3(Integer numOfNations,Integer numOfClasses, Integer numOfLvls){
        HashMap<String,String>[][][] shipArray = new HashMap<String,String>[][][];
    }

    public void AddShipByName(Integer nationNum, Integer typeNum, Integer lvlNum, String shipName, String pts){

        shipArray[nationNum][typeNum][lvlNum].put(shipName,pts);
    }

    public HashMap<String,String> GetShips(Integer nationNum, Integer typeNum, Integer lvlNum){
        return shipArray[nationNum][typeNum][lvlNum];
    }
}
