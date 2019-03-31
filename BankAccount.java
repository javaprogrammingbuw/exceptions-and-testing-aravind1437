
import java.util.Random;

public class BankAccount {
	 final String bic = "ABCDDEFFXXX";
	 private String iban = "DE00 1234 5678 0000 0000 00";
	 int securityNumber;
	 double limit;
	 double balance;
	 private Person owner;
    
	
	public void AccDetails() {
		
		String a="";
		for (int j=0; j<6; j++){
		a+= new Random().nextInt(10);
		}
		this.securityNumber=Integer.parseInt(a);
		String b="";
		String s = iban.substring(0,12);
		for (int i=0; i<10; i++){
		b+= new Random().nextInt(10);
		}
		
		//this.owner = owner;
        //this.balance = balance;
        //this.limit = limit;
		this.iban = s + b;
     }
	
   public BankAccount(Person owner, double balance){
		
	   AccDetails();
	   this.owner = owner;
	   this.balance = balance;
	   this.limit = 0.0;
	   String a ="";
	   for (int j=0; j<6; j++){
	   a+= new Random().nextInt(10);
	   }
     
	   this.securityNumber = Integer.parseInt(a);
       String b ="";
       String s = iban.substring(0,12);
       for (int i=0; i<10; i++){
	   b+= new Random().nextInt(10);
       }
       this.iban = s + b;
       }
	public Person getowner() {
		return this.owner;
	    }
	public double getbalance() {
		return this.balance;
     	}
	public void setbalance(double balance){
		this.balance = balance;
	    } 
	public double getlimit() {
		return this.limit;
     	}
	public String getiban() {
		return this.iban;
     	}
	

    public double deposit(double deposit,int securityNumber) {
	  if(this.securityNumber == securityNumber) {
	  balance = balance + deposit;
	    }else {
	    System.out.println("Invalid Security number");
	    }
	    return balance;
	    }
   public double withdraw(double amount) {
	   if(this.securityNumber == securityNumber) {
	   if(amount <= (balance + limit)) {
	   return balance-= amount;
	    }else {
		   System.out.println("Insufficient Funds");
	    }	 
	    }
	    return balance;
        }
   public void transfer(BankAccount remote, double amount, int securityNumber){
		if(securityNumber==this.securityNumber) {
		if(amount < balance+limit){
		}
		remote.setbalance(remote.getbalance()+amount);
		setbalance(balance-amount);
		}else{
           System.out.println("Check with the security number or available limit");
		}
	    }
   public void print(){
		   System.out.println(this.iban+" and "+this.securityNumber);
	    }
}