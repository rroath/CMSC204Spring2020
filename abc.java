package abc;

public class abc {

	public static void main(String[] args) {
		
		MyBag PiggyBank = new MyBag();
		
		for (int i = 0; i < 7; i++) {
			if (PiggyBank.add(MyBag.Coin.Penny)) {
				System.out.println("A Penny was added to the Piggy Bank.");
			} else {
				System.out.println("Bank was FULL.  Cound not add a coin to it");
			}
		}
		
		System.out.println("\nAbout to reset the Piggy Bank.");
		PiggyBank.clear();
		if (PiggyBank.isEmpty()) {
			System.out.println("Piggy Bank is currently EMPTY!");
		}
		System.out.println("Bank: " + PiggyBank.getCurrentSize());
		
		
		System.out.println("Done!");

	}

}
