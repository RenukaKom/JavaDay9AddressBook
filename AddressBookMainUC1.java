package com.bridgelabz.day9;

import java.util.Scanner;

public class AddressBookMainUC1 {
    public static void main(String[] args) {
        System.out.println("Contact details of the person:");
        PersonDetails pd = new PersonDetails();
        pd.getDetails();

    }
}
class Name{
    public void printName(){
        System.out.println("Enter name of the Person: ");
    }
}
class Address {
    public void printAddress() {
        System.out.println("Enter Address of the Person: ");
    }
}
class City {
    public void printCity() {
        System.out.println("Enter City: ");
    }
}
class State {
    public void printState() {
        System.out.println("Enter State : ");
    }
}
class ZipCode {
    public void printZipCode() {
        System.out.println("Enter Zipcode of the Area: ");
    }
}
class PhoneNumber {
    public void printPhoneNumber() {
        System.out.println("Enter Phone Number of the Person: ");
    }
}
class Email {
    public void printEmailId() {
        System.out.println("Enter email Id of the Person: ");
    }
}
class PersonDetails{
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        Name name = new Name();
        name.printName();
        sc.nextLine();
        Address address = new Address();
        address.printAddress();
        sc.nextLine();
        City name1 = new City();
        name1.printCity();
        sc.nextLine();
        State name2 = new State();
        name2.printState();
        sc.nextLine();
        ZipCode name3 = new ZipCode();
        name3.printZipCode();
        sc.nextInt();

        Scanner num = new Scanner(System.in);
        PhoneNumber name4 = new PhoneNumber();
        name4.printPhoneNumber();
        num.nextInt();

        Scanner sc2 = new Scanner(System.in);
        Email name5 = new Email();
        name5.printEmailId();
        sc2.nextLine();
    }
}