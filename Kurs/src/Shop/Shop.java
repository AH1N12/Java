package Shop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Shop {     								// dodac obsluge gdy plik nie istnieje
	private List<Product> products = new ArrayList<Product>();

	private void writeInfo(Product p) throws Exception {
		File storehouse = new File("Storehouse.txt");
		OutputStreamWriter str = new OutputStreamWriter(new FileOutputStream(storehouse, true));
		str.append(p.toString() + ">");
		str.close();

	}

	private static String readInfo() throws Exception { 
		StringBuilder tmp = new StringBuilder();
		BufferedReader str = new BufferedReader(new FileReader("Storehouse.txt"));
		String line;
		while ((line = str.readLine()) != null) {
			tmp.append(line);
		}
		str.close();
		return tmp.toString();
	}

	
	
	public Shop() {
		// if (Files.notExists(arg0, arg1)) {
		//
		// }
		String temp;
		try {
			temp = readInfo();
			if (temp.length() < 1) {
				System.out.println("Empty shop created. You need to add some products.");
				return;
			}

			String[] arrayOfStrings = temp.split(">");
			System.out.println("Inventory balance: ");
			for (String string : arrayOfStrings) {
				String[] tempArray = string.split("/");
				products.add(new Product(tempArray[0], Double.parseDouble(tempArray[1])));
				System.out.println("added " + tempArray[0]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addProduct(String name, double price) {
		String[] splitter = Double.toString(price).split("\\."); // moze byc
																	// problem
		if (splitter[1].length() <= 2) {
			Product p = new Product(name, price);
			products.add(p);

			try {
				writeInfo(p);
			} catch (Exception e) {
				System.out.println("Could not add product " + p.getName());
				e.printStackTrace();
			}
			System.out.println("added: " + p.getName());
			return;
		}
		System.out.println("Incorrect price format! Could not add product " + name);

	}

	public void lookAtStorehause() throws Exception {

		String temp = readInfo();
		if (temp.length() < 1) {
			System.out.println("Storehouse is empty. nothing to see there.");
			return;
		}
		String[] arrayOfStrings = temp.split(">");
		System.out.println("Inventory balance: ");
		for (String string : arrayOfStrings) {
			String[] tempArray = string.split("/");
			System.out.println("product : " + tempArray[0] + " price: " + tempArray[1]);
		}
		
	}

	public void sell(Product p) throws Exception {
		if (products.contains(p)) {
			String name= p.getName();
			products.remove(p);
			System.out.println("sold " + name);
			writeToStorehouse();
		}

	}

	public void sell(String name) throws Exception {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(name)) {
				products.remove(i);
				System.out.println("sold " + name);
				writeToStorehouse();
				return;
			}
		}
	}

	private void writeToStorehouse() throws Exception {
		StringBuilder sb = new StringBuilder();
		products.forEach(product -> {
			sb.append(product.toString() + ">");
		});
		File storehouse = new File("Storehouse.txt");
		OutputStreamWriter str = new OutputStreamWriter(new FileOutputStream(storehouse));
		str.append(sb.toString());
		str.close();

	}

}
