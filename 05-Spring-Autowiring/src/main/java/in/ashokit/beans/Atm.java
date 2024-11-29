package in.ashokit.beans;

public class Atm {

	private IPrinter printer;
	
	public Atm() {
		System.out.println("Atm :: Constructor");
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}
	
	public void withdraw() {
		System.out.println("Withdraw successfull.......");
		printer.print();
	}
	
}
