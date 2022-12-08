package State;

public class KhongDuTien implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

}
