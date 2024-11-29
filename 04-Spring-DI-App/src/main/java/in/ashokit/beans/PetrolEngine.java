package in.ashokit.beans;

public class PetrolEngine implements IEngine {
	
	private PetrolEngine eng;

	public PetrolEngine() {
		System.out.println("PetrolEngine :: 0-param Constructor");
	}
		
	@Override
	public int start() {
		System.out.println("PetrolEngine started.......");
		return 1;
	}
}
