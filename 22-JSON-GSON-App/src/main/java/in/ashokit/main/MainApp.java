package in.ashokit.main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import in.ashokit.model.Product;

public class MainApp {

	public static void main(String[] args) throws Exception {

		MainApp app = new MainApp();
		 // app.JavaToJson();
		app.convertGsonToJava();
	}

	public void JavaToJson() {

		Product p = new Product();

		p.setId(101);
		p.setName("Hard DIsk");
		p.setPrice(1000.00);

		Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();

		String jsonStr = gson.toJson(p);

		// printing json on console
		System.out.println(jsonStr);
	}

	public void convertGsonToJava() throws Exception {

		// pointing to json file data using reader
		FileReader fr = new FileReader("Product.json");

		// creating gson class object
		Gson gson = new Gson();

		// converting json file data to java object
		Product p = gson.fromJson(fr, Product.class);

		System.out.println(p);
	}

}
