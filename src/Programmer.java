public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("coding()");
    }

    @Override
    public String toString() {
        return "\nProgrammer: " +
                "\ncompanyName: " + companyName + super.toString();
    }
}
