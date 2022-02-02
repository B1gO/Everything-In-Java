package design_pattern.flyweight;

/**
 * @author ylyu
 * @version 1.0
 * @date 2/2/22 10:46 AM
 */
public class Client {

    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("grey");

        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("red");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("yellow");

        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("blue");

        System.out.println("O shape is same? " + (box3 == box4));
    }
}
