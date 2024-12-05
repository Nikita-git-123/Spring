package in.ashokit.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService {
	
	private BookDao bookDao;
	
	public BookService(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void storeBookData() throws Exception {
		
		File f = new File("Abc.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		while(line != null) {

			String[] data = line.split(",");
			Integer bid = Integer.parseInt(data[0]);
			String bname = data[1];
			Double bprice = Double.parseDouble(data[2]);
			
			bookDao.savebook(bid, bname, bprice);
					
			
			//read next line data
			line = br.readLine();
		}
		
		System.out.println("Books inserted in DB..........");
		br.close();
	}
}