package design_pattern.behavioral.state.before;

/**
 * @author Yanan Lyu
 * @date 2/21/22 7:31 AM
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.setState(ILift.OPENING_STATE);

        lift.open();

        lift.close();

        lift.run();

        lift.stop();
    }
}
