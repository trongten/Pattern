package State;

public class HetHang implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

}
