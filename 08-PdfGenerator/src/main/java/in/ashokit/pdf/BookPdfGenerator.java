package in.ashokit.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class BookPdfGenerator {
	
	public void generatePdf(List<BookPdf> lsbp) throws FileNotFoundException, DocumentException {
		
		Document document = new Document();
		
		PdfWriter.getInstance(document, new FileOutputStream("BookDetails.pdf"));
		
		document.open();
		
		document.add(new Paragraph("Book Details Report "));
		
		PdfPTable pdfTable = new PdfPTable(3);
		
		pdfTable.addCell("ID");
		pdfTable.addCell("Name");
		pdfTable.addCell("Price");
		 
		for(BookPdf b : lsbp) {
			
			pdfTable.addCell(String.valueOf(b.getId()));
			pdfTable.addCell(b.getName());
			pdfTable.addCell(String.valueOf(b.getPrice()));
		}
		
		document.add(pdfTable);
		
		document.close();
		
		
	}

}
