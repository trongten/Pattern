package Factory;

public class BankFactory {
     public static Bank getFactory(String s ) {
    	 if(s.equalsIgnoreCase("Sacombank")) {
    		 return new Sacombank();
    	 } else if(s.equalsIgnoreCase("Vietinbank")) {
    		 return new ViettinBank();
    	 } else if(s.equalsIgnoreCase("ACB")) {
    		 return new ACB();
    	 }
    	 return null;
     }
}
