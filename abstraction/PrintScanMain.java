package abstraction;

public class PrintScanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPprinter hp = new HPprinter();
		CanonPrinter cp = new CanonPrinter();
		
		cp.print();
		cp.scan();
		hp.print();

	}

}
