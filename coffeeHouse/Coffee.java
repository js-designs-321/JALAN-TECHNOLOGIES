package coffeeHouse;

public class Coffee {
	
	private CoffeeType type; 
	private CoffeeAddOn addOn; 
	private int billAmount; 
	
	public void displayAllCombinations() {
		
		System.out.println("Avaliable Options :-> "); 
		
		for(CoffeeType cType : CoffeeType.values()) {
			for(CoffeeAddOn cAddOn : CoffeeAddOn.values()) {
				System.out.println(cType + " " + cAddOn); 
			}
		}
		
	}
	
	private void manageBill() {
		if(type == CoffeeType.ESPRESSO && addOn == CoffeeAddOn.MILK) {
			billAmount += 60; 
		}else if(type == CoffeeType.ESPRESSO && addOn == CoffeeAddOn.CREAM) {
			billAmount += 75; 
		}else if(type == CoffeeType.ESPRESSO && addOn == CoffeeAddOn.LATTE) {
			billAmount += 100; 
		}else if(type == CoffeeType.CAPPUCCINO && addOn == CoffeeAddOn.MILK) {
			billAmount += 80; 
		}else if(type == CoffeeType.CAPPUCCINO && addOn == CoffeeAddOn.CREAM) {
			billAmount += 90; 
		}else if(type == CoffeeType.CAPPUCCINO && addOn == CoffeeAddOn.LATTE) {
			billAmount += 125; 
		}else if(type == CoffeeType.LATTE && addOn == CoffeeAddOn.MILK) {
			billAmount += 100; 
		}else if(type == CoffeeType.LATTE && addOn == CoffeeAddOn.CREAM) {
			billAmount += 125; 
		}else if(type == CoffeeType.LATTE && addOn == CoffeeAddOn.LATTE) {
			billAmount += 150; 
		}
	}
	
	public void selectCoffee(int inputCoffeeType,int inputCoffeeAddOn) {
		
		if(inputCoffeeType == 1) {
			type = CoffeeType.ESPRESSO; 
		}else if(inputCoffeeType == 2) {
			type = CoffeeType.CAPPUCCINO; 
		}else{
			type = CoffeeType.LATTE; 
		}
		
		if(inputCoffeeAddOn == 1) {
			addOn = CoffeeAddOn.MILK; 
		}else if(inputCoffeeAddOn == 2) {
			addOn = CoffeeAddOn.CREAM; 
		}else{
			addOn = CoffeeAddOn.LATTE; 
		}
		
		manageBill(); 
	}
	
	public int getBill() {
		return billAmount; 
	}
	
}
