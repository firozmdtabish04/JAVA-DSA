package OOPsConcept.Inheritance;

class Keyboard{
    final int keys = 13;
    String Color = "RED";
    public void pressed(){
        System.out.println("Button Hit! - " + Color);
    }
    public void throwIt(){
        System.out.println("Reply!");
    }
}
// Inheritance
class AdvancedKeyboard extends Keyboard
{
public void hitNum(){
    System.out.println("Hit Num!");
}
}

public class Object {
public static void main(String[] args) {
    // Keyboard obj = new Keyboard();  //for normal
    // obj.pressed();
    // obj.throwIt();
    AdvancedKeyboard obj = new AdvancedKeyboard();
    obj.pressed();
    obj.throwIt();
    obj.hitNum();
    
}

}
