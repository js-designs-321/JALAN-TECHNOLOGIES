package coffeeHouse;

import java.util.Scanner; 

public class CoffeeManager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		Coffee coffee = new Coffee(); 
		boolean addMoreItem = false;
		do {
			addMoreItem = false;
			System.out.println("Press 1 : View available combinations");
			System.out.println("Press 2 : Order coffee");
			int input = s.nextInt(); 
			if(input == 1) {
				coffee.displayAllCombinations();
			}else if(input == 2) {
				System.out.println("Select coffee type : ");
				System.out.println("Press 1 : Espresso");
				System.out.println("Press 2 : Cappuccino");
				System.out.println("Press 3 : Latte");
				int inputCoffeeType = s.nextInt();
				System.out.println("Select add-on      : ");
				System.out.println("Press 1 : Milk");
				System.out.println("Press 2 : Cream");
				System.out.println("Press 3 : Latte");
				int inputCoffeeAddOn = s.nextInt(); 
				coffee.selectCoffee(inputCoffeeType, inputCoffeeAddOn);
			}
			System.out.println("Press 1 : Add item");
			System.out.println("Press 2 : Get Bill");
			input = s.nextInt(); 
			if(input == 1) {
				addMoreItem = true; 
			}else if(input == 2) {
				int amount = coffee.getBill(); 
				System.out.println(amount); 
			}
			
		}while(addMoreItem);
		s.close();
	}

}
