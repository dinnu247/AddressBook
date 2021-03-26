package addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addressbook {
    public static final int Add_details = 1;
    //Scanner is used to get the data from user
    Scanner user = new Scanner(System.in);
//Declaring Variables
    String First_Name,Last_Name,Address,City,State,Email_Id;
    int  Zipcode;
    long PhoneNumber;
    //using method assigning a variables from user
    public void set_contact_details(){
        System.out.println("Enter the First Name");
        this.First_Name=user.nextLine();
        System.out.println("Enter the Last Name");
        this.Last_Name = user.nextLine();
        System.out.println("Enter the Address");
        this.Address=user.nextLine();
        System.out.println("Enter the City ");
        this.City=user.nextLine();
        System.out.println("Enter the State");
        this.State= user.nextLine();
        System.out.println("Enter the Zipcode");
        this.Zipcode=user.nextInt();
        System.out.println("Enter the Phone number");
        this.PhoneNumber=user.nextLong();
        System.out.println("Enter the Email Id");
        this.Email_Id=user.next();

    }
    //Displaying the output in String Format
    public String toString() {

        return ("FIRST NAME : " +First_Name+ "\nLAST NAME : " +Last_Name+ "\nAddress : "+Address+"\nCity : "+City+"\nState : "+State+
                "\nZipcode : "+Zipcode+"\nPhone number : "+PhoneNumber+"Email Id : "+Email_Id);
    }
    public static void main(String[] args ){
        System.out.println("Welome to Address book");
        Scanner input = new Scanner(System.in);
        //creating a user data list
        List<Addressbook> user_data = new ArrayList<>();
        System.out.println("HOW MANY USERS DO YOU WANT TO ADD");
//asking a user to add details or not
        int choice=input.nextInt();
        if (choice == Add_details) {

            int user_choice = input.nextInt();
            for (int i = 0; i < user_choice; i++) {
              //creating an object and adding given details into user data list
                Addressbook Person = new Addressbook();
                Person.set_contact_details();
                user_data.add(Person);
                System.out.println(Person.toString());
            }
        }
    }
}
