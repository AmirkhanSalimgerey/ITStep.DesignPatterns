package behavioral.state;

public class StateContext {
    private State state;

    public StateContext() {
        state = null;
    }

    public StateContext(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
