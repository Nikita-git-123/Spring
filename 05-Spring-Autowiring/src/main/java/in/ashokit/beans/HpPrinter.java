package in.ashokit.beans;

public class HpPrinter implements IPrinter{

	public HpPrinter() {
		System.out.println("HpPrinter :: Constructor");
	}

	@Override
	public void print() {
		System.out.println("Print with HpPrinter.......");
	}
	
}
