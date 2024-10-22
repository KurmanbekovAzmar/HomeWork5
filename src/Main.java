public class Main {
    public static void main(String[] args) {
    Programmer programmer = new Programmer();
    programmer.setName("Azmar");
    programmer.setDesignation("programmer");
    programmer.setCompanyName("Java-16");
    Dencer dencer = new Dencer();
    dencer.setName("Elaman");
    dencer.setDesignation("Dencer");
    dencer.setGroupName("Gold Teatr");
    Singer singer = new Singer();
    singer.setName("Adilet");
    singer.setDesignation("singer");
    singer.setBandName("Bad Boys");
        System.out.println(programmer);
        System.out.println("____________________________");
        System.out.println(dencer);
        System.out.println("____________________________");
        System.out.println(singer);
    }
}