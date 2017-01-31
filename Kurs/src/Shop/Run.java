package Shop;

public class Run {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addProduct("japko", 12.232);
		shop.addProduct("grucha", 12.23);
		shop.addProduct("slifka", 12.23);
		try {
			shop.lookAtStorehause();
			shop.sell("grucha");
			shop.lookAtStorehause();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
//Zbudowac aplikacje sklep.
//W sklepie mozemy obejrzec stan magazynu
//Ustalic ceny towaru
//Dokonac sprzedarzy
//Przyjac towar
//Stan magazynu musi byc zachowany miêdzy wykonaniami programu
//
