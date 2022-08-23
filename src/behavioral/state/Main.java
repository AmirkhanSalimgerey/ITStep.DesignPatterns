package behavioral.state;

public class Main {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        StartState startstate = new StartState();
        startstate.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopstate = new StopState();
        stopstate.doAction(context);
        System.out.println(context.getState().toString());
    }
}
