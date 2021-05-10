package saleslist;

import java.util.Scanner;

public class AdeMenu extends Menu implements MenuInput {

	
	public AdeMenu(MenuKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Menu name :");
		String name = input.next();
		this.setName(name);
		
		String answer = "N";
		
		while (true) {
		System.out.print("시즌 메뉴 인가요 ? (Y/N) : "); //시즌 메뉴는 1000원 할인된 금액으로 저장
		answer = input.next();
		if (answer.equals("y") || answer.equals("Y")) {
			System.out.print("Menu price :");
			int price = input.nextInt();
			this.setPrice(price - 1000);
			this.setSeason(answer);
		}
		else {
			System.out.print("Menu price :");
			int price = input.nextInt();
			this.setPrice(price);
			this.setSeason(answer);
		}
		break;
		}
	}
	
	
	
	public void printmenu() {
		String mkind = "Ade";
		System.out.println("kind: " + mkind + "\nname : " + this.getName() + "\nprice : " + this.getPrice()  + "\nseason : " + this.getSeason());
		System.out.println("---------------------------------------------------------------");
	}

}
