
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code step 3 creating variables
		int NumOfFriends = 61;
		double ItemPrice = 5.25;
		double AmountInWallet = 12;
		String FirstName = "John";
		String LastName = "Hancock";
		char MiddleIni = 'A';
		double Age = 43;
		
		// code step 4 using operations
		double NewAmountInWallet = AmountInWallet - ItemPrice;
		double FriendsPerYear = NumOfFriends / Age;
		String FullName = FirstName + " " + MiddleIni + " " + LastName;

		// code step 5 printing
		System.out.println("Item price is $" + ItemPrice);
		System.out.println("Money in wallet is $" + AmountInWallet);
		System.out.println("Number of friends is " + NumOfFriends);
		System.out.println("My age is " + Age);
		System.out.println("My full name is " + FullName);
		System.out.println("Amount left in wallet after a purchase is $" + NewAmountInWallet);
		System.out.println("Friends added per year is " + FriendsPerYear);
	}

}
