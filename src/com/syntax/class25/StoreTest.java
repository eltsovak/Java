package com.syntax.class25;

public class StoreTest {


	public static void main(String[] args) {
		
		Store macys = new Macys("Macys", "Tysons, Virginia");
		Store starbucks = new Starbucks("Starbucks", "New York");
		Store nike = new Nike("Nike", "Los-Angeles", "running shoes");
		
		Store[] myStores = {macys, starbucks, nike};
		Store[]stores = {new Macys("Macys", "Florida"), new Starbucks("Starbucks", "Texas"), new Nike("Nike", "Illinois", "running shoes")};
		
		int size = stores.length;
		System.out.println(size);
		for(Store s:stores) {
			s.openHours();
			s.sell();
			System.out.println("--------------------");
		}
		
		System.out.println("----LOOPING MY STORES ARRAY-------");
		
		for(int i = 0; i < myStores.length; i++) {
			myStores[i].openHours();
			System.out.println("------------");
		}
	}

}

