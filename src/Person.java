public class Person {
    private String name;
    private String designation;

    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learning() {
        System.out.println("Learning()");
    }

    public void walk() {
        System.out.println("walk()");
    }

    public void eating() {
        System.out.println("eating()");
    }

    @Override
    public String toString() {
        return "\nPerson: " +
                "\nname: " + name +
                "\ndesignation: " + designation;
    }
}
