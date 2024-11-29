package in.ashokit.spring;

public class DateUtils {
	
	private DateUtils() {
		System.out.println("DateUtils :: Constructor");
	}
	
	private static class Singleton {
		private static final DateUtils INSTANCE = new DateUtils();
	}
	
	public static DateUtils getInstance() {
		return Singleton.INSTANCE;
	}
	
	//Thread safety singleton
	/*
	 * public static synchronized DateUtils getInstance() { if( instance == null)
	 * instance = new DateUtils(); return instance; }
	 */
	
	//Static initialization.....
	/*
	 * static { try { instance = new DateUtils(); } catch (Exception ex) {
	 * ex.printStackTrace(); } }
	 */
	
	//Eager Initialization.......
	/*
	 * public static DateUtils getInstance() { return instance;
	 * 
	 * }
	 */
	
	
	//Lazy Initialization...
	/*
	 * public static DateUtils getInstance() { if( instance == null) instance = new
	 * DateUtils();
	 * 
	 * return instance; }
	 */
}
