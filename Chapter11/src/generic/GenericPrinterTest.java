package generic;


public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
	}

}
