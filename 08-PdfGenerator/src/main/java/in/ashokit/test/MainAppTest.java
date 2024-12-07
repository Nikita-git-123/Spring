package in.ashokit.test;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itextpdf.text.DocumentException;

import in.ashokit.pdf.BookPdfService;

public class MainAppTest {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Pdf.xml");
		
		BookPdfService bookPdfService = ctxt.getBean(BookPdfService.class);
		
		bookPdfService.getPdf();
		
		System.out.println("Successfull............");
	}

}
