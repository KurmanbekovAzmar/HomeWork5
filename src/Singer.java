public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void sining() {
        System.out.println("sining()");
    }

    public void playGitar() {
        System.out.println("play gitar()");
    }


    @Override
    public String toString() {
        return "\nSinger: " +
                "\nband Name: " + bandName + super.toString();
    }
}
