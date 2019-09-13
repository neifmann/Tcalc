import static java.lang.Math.floor;

public class Ship {
    private Integer lvl, pts;
    private String name, type, nation;

    //базовый конструктор
    public Ship ( String nation, String type, Integer lvl, String name, Integer pts) {

        this.nation = nation;
        this.type = type;
        this.lvl = lvl;
        this.name = name;
        this.pts = pts;

    }

    //общий конструктор*
    public Ship (String name, Integer lvl, String type) {
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

    //спец. конструктор
    public Ship (String name, Integer lvl, String type, Integer pts) {
        this.name = name;
        this.lvl = lvl;
        this.type = type;
        this.pts = pts;
    }

    public Integer getPts() {
        return this.pts;
    }

}