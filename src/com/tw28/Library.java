package com.tw28;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;


public class Library extends Book implements MovieInterface{
    public static int choice=0;
    public static int GetChoice() {
        return choice;
    }
    public static void main(String[] args) throws IOException {
        Book B = new Book();
        int isbn = 0,user_id=0,i;
        int flag;
        String entered_password;


        System.out.println("WELCOME TO PUBLIC LIBRARY SYSTEM\n");
        System.out.println("MOVIE DETAILS\n MOVIE NAME\t\t DIRECTOR NAME\t\tRATING");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<15;i++)
        {
            System.out.println(movie_name+"\t"+director_name+"\t"+rating);
        }
        System.out.println("------------------LOGIN--------------------");
        System.out.println("Enter user id:");
        user_id=Integer.parseInt(reader.readLine());

        for(i=0;i<3;i++)
        {
            if(user_id==User_id[i])
            {
                break;
            }
        }

        System.out.println("Enter password:");
        entered_password = reader.readLine();
            if(entered_password == password[i])
            {

            do{
            flag=0;
            System.out.print("Please enter your choice :\n 1:List all books\n 2:Reserve a book\n 3:Return a book\n 4:Exit\n ");
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Nothing was Entered, Re-try!!\t");
            }
            switch(choice){
                case 1:
                    B.Display();
                    break;

                case 2:
                    System.out.println("enter the book isbn :");
                    try {
                        isbn = Integer.parseInt(reader.readLine());
                        System.out.println("enter the book user ID:");

                    } catch (IOException e) {
                        System.out.println("Invalid Entry, Re-try!!\t");
                    }

                    flag=B.Reserve(isbn,user_id);


                    if(flag==1) System.out.println("\nThank You! Enjoy the book\n");
                    else System.out.println("\nSorry we dont have that book\n");
                    break;

                case 3:
                    System.out.println("enter the book isbn");
                    try {
                        isbn = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Nothing was Entered, Re-try!!\t");
                    }

                    flag=B.Return(isbn);


                    if(flag==1) System.out.println("\nBook re taken successfully\n");
                    else System.out.println("Sorry! please talk to the librarian\n");
                    break;

                case 4: exit(0);

                default: System.out.println("Invalid option");
                    break;

            }
        }while(choice!=4);


    }
        else
                System.out.println("PLEASE CHECK IF U HAVE ENTERED CORRECT USERNAME AND PASSWORD. IF U DON'T HAVE AN ACCOUNT CONTACT THE LIBRARIAN");
}
}
