package com.addressbook;

public class Contacts {
        //instance variable declaration
        public String firstName, lastName, address, city, state, email,phoneNum;
        public  int zip;
        //constructor
        Contacts(String firstName, String lastName, String address, String city, String state, int zip, String phoneNum, String email)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNum = phoneNum;
            this.email = email;
        }
}

