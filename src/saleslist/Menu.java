package saleslist;

import java.util.Scanner;

public abstract class Menu {

	protected MenuKind kind = MenuKind.coffee;
	private String name;
	private int price;
	private String season;
	
	public Menu() {
		
	}
	
	public Menu(MenuKind kind) { 
		this.kind = kind;
	}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Menu(String name, int price, String season) {
		this.name = name;
		this.price = price;
		this.season = season;
	}
	
	public MenuKind getKine() {
		return kind;
	}

	public void setKine(MenuKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	
	public abstract void printmenu();
//		String mkind = "none";
//		switch(this.kind) {
//		case coffee:
//			mkind = "Coffee";
//			break;
//		case ade:
//			mkind = "Ade";
//			break;
//		case dessert:
//			mkind = "Dessert";
//			break;
//		default :
//		}
//		System.out.println("kind: " + mkind + "\nname : " + name + "\nprice : " + price);
//		System.out.println("---------------------------------------------------------------");
//	}
	
	public void getUserInput(Scanner input) { 
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Menu price :");
		int price = input.nextInt();
		this.setPrice(price);
		
	}
}
