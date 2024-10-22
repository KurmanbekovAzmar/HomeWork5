public class Dencer extends Person {
    private String groupName;

    public Dencer() {
    }


    public Dencer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dencing() {
        System.out.println("Dencing()");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "\nDencer{" +
                "\ngroupName: " + groupName + super.toString();
    }
}
