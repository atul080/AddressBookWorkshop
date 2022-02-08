/*
* @Author Atul Srivastav
* @Date 08-02-22
* Address Book Workshop.
* */
package com.addressbook;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBookOperations {
    public static Contacts allContacts =null;
    public static boolean addContact(String firstName,String lastName,String address,String city,String state,String email,String phoneNum,int zip)
    {
            //validating and creating contact
            if ((validatUserNames(firstName, lastName)) && (validatePhoneNumber(phoneNum)) && (validateEmail(email)) && (valZipCode(zip))) {
                allContacts = new Contacts(firstName, lastName, address, city, state, zip, phoneNum, email);
            } else
            {
                return false;
            }
            System.out.println("A new contact is created.");

            if (allContacts != null)
                return true;
            else
                return false;
    }

    public static boolean validatUserNames(String firstName,String lastName) {
        Pattern nameCheck= Pattern.compile("[A-Z]{1}[a-z]{2,}");
       boolean val = nameCheck.matcher(firstName).matches();
       if(val)
           val=nameCheck.matcher(lastName).matches();
       else
           return false;
       return val;
    }

    public static boolean validatePhoneNumber(String phnNum) {
        Pattern valPhn= Pattern.compile("^[0-9]{2}\\s[0-9]{10}$");
        boolean val = valPhn.matcher(phnNum).matches();
        return val;
    }

    public static boolean validateEmail(String email) {
        Pattern p= Pattern.compile("([a-z]|[a-z+-.a-z0-9])+((@[^-]+[a-z+.a-z+.a-z])|(@[^-][a-z+.a-z]))");
        boolean check = p.matcher(email).matches();
        return check;
    }
    public static boolean valZipCode(int zip) {
        Pattern p= Pattern.compile("^[0-9]{6}");
        String zipn=zip+"";
        boolean check = p.matcher(zipn).matches();
        return check;
    }


    public static boolean viewContact() {
        System.out.println("First Name: "+allContacts.firstName);
        System.out.println("Last Name: "+allContacts.lastName);
        System.out.println("Address Name : "+allContacts.address);
        System.out.println("City : "+allContacts.city);
        System.out.println("State: "+allContacts.state);
        System.out.println("Zip: "+allContacts.zip);
        System.out.println("Email id: "+allContacts.email);
        return true;
    }
}
