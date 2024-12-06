package in.ashokit.service;

import java.util.List;

import in.ashokit.dao.BookDao;
import in.ashokit.dto.BookDto;
import in.ashokit.excel.ExcelGenerator;

public class BookService {
	
	private BookDao bookDao;
	private ExcelGenerator excelGenerator;
	

	public BookService(BookDao bookDao, ExcelGenerator excelGenerator) {
		this.bookDao = bookDao;
		this.excelGenerator = excelGenerator;
	}

	public void getBook() throws Exception {
		
		List<BookDto> book = bookDao.getBook();
		
		excelGenerator.generateExcel(book);
		
		book.forEach(bk -> {
			System.out.println(bk);
		});
		//book.forEach(System.out::println);
	}
	

}
