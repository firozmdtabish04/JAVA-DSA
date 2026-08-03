package OOPsConcept.Basic;
class Keyboard{
    int keys =12;
    String Color;
    public void pressed(){
        System.out.println("Button Hit!");
    }
    public void throwIt(){
        System.out.println("Reply!");
    }
}
public class Object {
public static void main(String[] args) {
    Keyboard obj = new Keyboard();
    obj.pressed();
    obj.throwIt();
    System.out.println(obj.keys);
}

}
