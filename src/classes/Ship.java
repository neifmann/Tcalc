package classes;

import static java.lang.Math.floor;

public class Ship {
    private String name, type, nation, lvl, pts;

    public Ship(){

    }

    public Ship ( String nation, String type, String  lvl, String name, String pts) {

        this.nation = nation;
        this.type = type;
        this.lvl = lvl;
        this.name = name;
        this.pts = pts;

    }

    /*
    public Ship (String name, String lvl, String type) {
        this.name = name;
        this.lvl = lvl;
        this.type = type;

        switch (this.type) {

            case "dd":
                this.pts = this.lvl + Integer.valueOf((int) floor(lvl/10));
                break;

            case "cr":
                this.pts = this.lvl + Integer.valueOf((int) floor(lvl/7)) + Integer.valueOf((int) floor(lvl/9)) + Integer.valueOf((int) floor(lvl/11));
                if ( this.name == "Belfast" || this.name == "Kutuzau" || this.name == "Smolensk" ) { this.pts = this.pts + 1; };
                break;

            case "bcr":
                this.pts = this.lvl + Integer.valueOf((int) floor(lvl/7)) + Integer.valueOf((int) floor(lvl/9)) + Integer.valueOf((int) floor(lvl/11));
                break;

            case "bb":
                this.pts = this.lvl + ((this.lvl - 5)*(Integer.valueOf((int) floor(lvl/7))));
                if ( this.name == "Musashi" ) { this.pts = this.pts + 1; };
                break;

            case "car":
                this.pts = this.lvl + (4 * Integer.valueOf((int) floor(lvl/8))) + (3 * Integer.valueOf((int) floor(lvl/10)));
                break;

            case "ub":
                this.pts = this.lvl;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
    */

    public Ship (String name, String lvl, String type, String pts) {
        this.name = name;
        this.lvl = lvl;
        this.type = type;
        this.pts = pts;
    }

    public Ship (String name, String pts) {
        this.name = name;
        this.pts = pts;
    }

    public String  getPts() {
        return this.pts;
    }

}