package in.ashokit.task;

public class BookDao {
	
	private String bId;
	private String bName;
	private String bPrice;
	
	
	public BookDao(String bId, String bName, String bPrice) {
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}


	public String getbId() {
		return bId;
	}


	public void setbId(String bId) {
		this.bId = bId;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbPrice() {
		return bPrice;
	}


	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}


	@Override
	public String toString() {
		return "BookDao [bId=" + bId + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	
	

}
