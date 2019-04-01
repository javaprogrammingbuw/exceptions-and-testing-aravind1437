import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {

	//Missing

  /*Initialize*/
  //Test owner
  @Test public static void InitTest1() {
    //define
    Person owner = new Person("John Doe");
    BankAccount account = new BankAccount(owner, 1000.00);
    //test
    assertEquals(owner,account.getOwner(),0.001);
  }
}
