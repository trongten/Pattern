package Factory;

public class Demo {

	public static void main(String[] args) {
		Bank bank = BankFactory.getFactory("ACB");
		bank.getInfo();
		Bank bank2 = BankFactory.getFactory("Sacombank");
		bank2.getInfo();
		Bank bank3 = BankFactory.getFactory("Vietinbank");
		bank3.getInfo();
	}
}
