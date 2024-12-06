package in.ashokit.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService {

	private BookDao bookdao;

	public BookService(BookDao bookdao) {
		this.bookdao = bookdao;
	}
	
	public void StoreData() throws Exception{
		
		File f = new File("Abcd.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line != null) {
			
			String[] data = line.split(",");
			
			Integer bid = Integer.parseInt(data[0]);
			String bname = data[1];
			Double bprice = Double.parseDouble(data[2]);
			
			bookdao.saveBook(bid, bname, bprice);
			
			line = br.readLine();
		}
	}
	
	
}
