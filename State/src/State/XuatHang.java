package State;

public class XuatHang implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
		
	}

}
