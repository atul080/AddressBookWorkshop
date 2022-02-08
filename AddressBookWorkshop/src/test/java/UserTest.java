import com.addressbook.AddressBookOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void userShouldBeAbleToCreateContact()
    {
        boolean status= AddressBookOperations.addContact("Atul","Kumar","abc","Rajkot","GJ","abc@gmail.com","91 9756384563",675787);
        Assertions.assertTrue(status);

        boolean emailChk= AddressBookOperations.addContact("Atul","Kumar","abc","Rajkot","GJ","abc","91 9756384563",675787);
        Assertions.assertFalse(emailChk);

        boolean phnNum= AddressBookOperations.addContact("Atul","Kumar","abc","Rajkot","GJ","abc@gmail.com","9756384563",675787);
        Assertions.assertFalse(phnNum);

        boolean zipChek= AddressBookOperations.addContact("Atul","Kumar","abc","Rajkot","GJ","abc@gmail.com","91 9756384563",67787);
        Assertions.assertFalse(zipChek);
    }
  @Test
    public void userShouldBeAbleToPrint() {
        boolean status= AddressBookOperations.viewContact();
        Assertions.assertTrue(status);
    }

}
