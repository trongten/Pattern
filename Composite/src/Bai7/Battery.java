package Bai7;

import java.util.ArrayList;
import java.util.List;

public class Battery implements IBattery{

	private List<IBattery> elems = new ArrayList<IBattery>();
	int aCharger = -1; 
	int aDecharger = -1; 
	
	public Battery(int nCells, int capCells, boolean bycycles) {
		for (int i = 0; i < nCells; i++) {
			elems.add(new Cell(capCells));
		}
		// và các việc khởi ộng khác nếu cần
	}

	
	@Override
	public int getFullCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean discharge() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean charge() {
		// TODO Auto-generated method stub
		return false;
	}


	public void gm_add(IBattery b) {
		// TODO Auto-generated method stub
		elems.add(b);
	}


	public void gm_remove(IBattery b) {
		// TODO Auto-generated method stub
		elems.remove(b);
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		String buf = "[";
		for (IBattery c : elems) {
			buf += c + ", ";
		}
		return buf.substring(0, buf.length() - 2) + "]";
	}
	
}
