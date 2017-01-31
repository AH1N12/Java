package Shop;

public class Product {
	private String name;
	private double price;

	public Product(String name,double price) {
		this.price = price;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		String[] splitter = Double.toString(price).split("\\."); //moze byc problem
		if (splitter[1].length()<=2  ) {
			this.price=price;
			return;
		}
		System.out.println("Incorrect price format! Could not set price of " + name);
		
	}
	@Override
	public String toString(){	
		return name+ "/" + price;	
	}
}
