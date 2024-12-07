package in.ashokit.pdf;

import java.io.FileNotFoundException;
import java.util.List;

import com.itextpdf.text.DocumentException;

public class BookPdfService {
	
	private BookPdfDao bookPdfDao;
	private BookPdfGenerator bookPdfGenertor;
	
	
	public BookPdfService(BookPdfDao bookPdfDao, BookPdfGenerator bookPdfGenertor) {
		this.bookPdfDao = bookPdfDao;
		this.bookPdfGenertor = bookPdfGenertor;
	}
	
	public void getPdf() throws FileNotFoundException, DocumentException {
		
		List<BookPdf> bookPdf = bookPdfDao.getBookData();
		bookPdfGenertor.generatePdf(bookPdf);
		
		bookPdf.forEach(System.out::println);
	}
}
