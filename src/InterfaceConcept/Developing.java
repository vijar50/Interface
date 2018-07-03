package InterfaceConcept;

//We use the implements BankingClient interface to get all the methods from it. We can add multiple interfaces.
public class Developing implements BankingClient,DomainClient {
//Now this class is responsible for implementing all the methods of the BankingClient Interface
	public static void main(String[] args) {
		//Create an object of this class
		Developing dev = new Developing();
		dev.checkingbalance();
		dev.paycreditcard();
		dev.transferbalance();
		dev.login();
		//br calls the methods of BankingClient interface ONLY
		BankingClient br = new Developing();	//Runtime Polymorphism
		//br won't have the login method as we defined it here
		//br.login();
		br.checkingbalance();
		//ds calls the methods of DomainClient only
		DomainClient ds = new Developing();
		ds.investments();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("Pay Credit Card Implemented.");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("Transfer Balance Implemented.");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("Checking Balance Implemented.");
	}
	//We can add methods other than the Interface
	public void login() {
		System.out.println("Logged In Successfully.");
	}

	@Override
	public void investments() {
		// TODO Auto-generated method stub
		System.out.println("Invest Something.");
	}

}
