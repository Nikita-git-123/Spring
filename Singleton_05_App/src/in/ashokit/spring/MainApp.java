package in.ashokit.spring;

public class MainApp {

	public static void main(String[] args) {
		
		DateUtils du1 = DateUtils.getInstance();
		DateUtils du2 = DateUtils.getInstance();
		System.out.println(du1.hashCode());
		System.out.println(du2.hashCode());
	}

}
