public class Planets implements Nameable {
    private String name;
    public Planets(String name) {
        this.name = name;
    }
    public void getName () {
        System.out.println(name);
    }
}
