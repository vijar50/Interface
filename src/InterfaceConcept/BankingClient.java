package InterfaceConcept;
//An interface has methods, but no body. Only classes can implement the methods present in an interface
public interface BankingClient {
	//No braces as these are just method names
	//All these methods need to be public
	public void paycreditcard();
	public void transferbalance();
	public void checkingbalance();
}
