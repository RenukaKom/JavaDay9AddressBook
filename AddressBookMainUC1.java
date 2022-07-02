package com.bridgelabz.addressbook;
//Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email… 
import java.util.Scanner;

public class AddressBookMainUC1 {
    public static void main(String[] args) {
        AddressBookMainUC1 contact = new AddressBookMainUC1();
        contact.display();
    }
    Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private int phoneNumber;
    private String emailId;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
    public void display() {
        System.out.println("Enter your First name: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter your Last name: ");
        setLastName(sc.nextLine());
        System.out.println("Enter your Address: ");
        setAddress(sc.nextLine());
        System.out.println("Enter your City: ");
        setCity(sc.nextLine());
        System.out.println("Enter your State: ");
        setState(sc.nextLine());
        System.out.println("Enter your ZipCode: ");
        setZipCode(sc.nextInt());
        System.out.println("Enter your Phone Number: ");
        setPhoneNumber(sc.nextInt());
        System.out.println("Enter your Email Id: ");
        setEmailId(sc.nextLine());
    }
}

