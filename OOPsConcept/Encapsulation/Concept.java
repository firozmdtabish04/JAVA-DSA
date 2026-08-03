package OOPsConcept.Encapsulation;
class Keyboard{
    private int regd;
    private String name;
    public int getRegd() {
        return regd;
    }
    public void setRegd(int regd) {
        this.regd = regd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    
}
public class Concept {
public static void main(String[] args) {
    Keyboard obj = new Keyboard();
    obj.setRegd(471);
    obj.setName("Tabish");

    System.out.println("Registration no.: "+obj.getRegd());
    System.out.println("Name : "+obj.getName());

}
}
