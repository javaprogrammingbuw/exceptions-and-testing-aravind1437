import static TinyTestJ.Assert.*;

import TinyTestJ.Test;

public class TestSuite{

  /*Initialize*/
  //Test owner
  @Test public static void InitTest1() {
        //define
        Person owner = new Person("John Doe");
        BankAccount account = new BankAccount(owner, 1000.00);
        //test
        assertEquals(owner.name, account.getowner().name, 0.001);
    }

  @Test public static void InitTest2() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00);
	    //test
	    assertEquals(1000.00,account.getbalance(),0.001);
	}
 
  @Test public static void InitTest3() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00);
	    boolean result = (account.getSecurityNumber()<10000) && (account.getSecurityNumber()>1000);
	    //test
	    assertEquals(true,result,0.001);
	  }

  @Test public static void InitTest4() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00,500.00);
	    //changes
	    account.deposit(200.00,account.getSecurityNumber());
	    //test
	    assertEquals(1200.00,account.getbalance(),0.001);
	  }

  @Test public static void InitTest5() {
	    //define
	    Person owner = new Person("John Doe");
	    //changes
	    BankAccount account = new BankAccount(owner, 1000.00,2000.00);
	    //test
	    assertEquals(2000.00,account.getlimit(),0.001);
	  }
  
  @Test public static void InitTest6() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00);
	    System.out.println(account.getiban());
	    //test
	    assertEquals(22,account.getiban().length(),0.001);
	  }
  
  @Test public static void InitTest7() {
	    //define
	    Person owner = new Person("John Doe");
	    BankAccount account = new BankAccount(owner, 1000.00);
	    //test
	    assertEquals(0.00,account.getlimit(),0.001);
	  }
  
  @Test public static void IniTest8() {
		//define
	    Person owner = new Person("chris");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		//test
		assertEquals(1000.00,account.getlimit(),0.001);
	}
  
  @Test public static void IniTest9() {
		//define
	    Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 500.00);
		account.deposit(700.00,account.getSecurityNumber());
		account.withdraw(200.00,account.getSecurityNumber());
        //test
		assertEquals(1000.00,account.getbalance(),0.001);
    }	
  
  @Test public static void IniTest10() {
		//define
	    Person owner = new Person("Krish");
		BankAccount account = new BankAccount(owner, 1000.00);	    
		//test
		assertEquals(0.00,account.getlimit(),0.001);
    }	
  
  @Test public static void IniTest11() {
		//define
	    Person owner = new Person("John Doe");
		Person holder= new Person("Krish");
		BankAccount account = new BankAccount(owner,1000.00,2000.00);
		BankAccount studentAccount= new BankAccount(holder,5000.00,1000.00);	    
		account.transfer(studentAccount,500.00,account.getSecurityNumber());
		account.deposit(1000.00,account.getSecurityNumber());	    
		//test
		assertEquals(6600.00,studentAccount.getbalance(),0.001);
	}
  
  @Test public static void IniTest12() {
		//define
	    Person owner = new Person("yash");
		BankAccount account = new BankAccount(owner,1000.00,5000.00);
		//test
		assertEquals(1000.00,account.getlimit(),0.001);
	}
		
  @Test public static void IniTest13() {
		//define
	    Person owner = new Person("John Doe");
		Person anotherowner=new Person("Hero");
		BankAccount account = new BankAccount(owner, 1000.00,500.00);
		BankAccount remote=new BankAccount(anotherowner,1500.00);
		account.transfer(remote,300.00,account.getSecurityNumber());
		//test
		assertEquals(1800.00,remote.getbalance(),0.001);
	}
  
  @Test public static void IniTest14() {
		//define
	    Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 5000.00);
		account.deposit(500.00,account.getSecurityNumber());
		account.withdraw(1000.00,account.getSecurityNumber());
		account.deposit(300.00,account.getSecurityNumber());
		account.deposit(100.00,account.getSecurityNumber());
		//test
		assertEquals(4900.00,account.getbalance(),0.001);
    }
  
  @Test public static void IniTest15() {
		//define
	    Person owner = new Person("John Doe");
		BankAccount account = new BankAccount(owner, 1000.00,2000.00);
		account.withdraw(2500.00,account.getSecurityNumber());
		//test
		assertEquals(-1500,account.getbalance(),0.001);
	}
}