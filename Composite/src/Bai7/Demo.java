package Bai7;

public class Demo {

	public static void main(String[] args) {
		IBattery b1 = new Cell(2);
		System.out.println("DL max của b1 = " + b1.getFullCapacity() + ", DL hiện hành = " + b1.toString());
		b1.charge();
		System.out.println("Dung luong của b1 sau khi nap them 1u = " + b1.toString());
		
		b1.discharge();
		b1.discharge();
		b1.discharge();
		b1.discharge();
		System.out.println("Dung luong của b1 sau khi xa 4u = " + b1.toString());
		
		b1 = new Cell(10);
		Battery b2 = new Battery(3, 5, false); 
		Battery b3 = new Battery(2, 10, false); 
		b3.gm_add(b1);
		b3.gm_add(b2);
		System.out.println("Trang của b3 = " + b3.toString());
	
		b3.discharge();
		b3.discharge();
		System.out.println("b3 sau khi xả 2u = " + b3.toString());
		
		b3.charge();
		b3.charge();
		System.out.println("b3 sau khi nạp 2u = " + b3.toString());

	}

}
