package State;

public class Context {

	public State state;

	public Context() {	
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
