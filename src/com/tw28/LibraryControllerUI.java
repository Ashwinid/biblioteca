package com.tw28;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;


public class LibraryControllerUI {
    public static int choice=0;
    public static void main(String[] args) throws IOException {
        Library L= new Library();
        L.initialize();

        int isbn = 0,user_id=0,i;
        int flag;
        String entered_password;


        System.out.println("WELCOME TO PUBLIC LIBRARY SYSTEM\n");
        System.out.println("MOVIE DETAILS\n MOVIE NAME\t\t DIRECTOR NAME\t\tRATING");
        L.displayMovie();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("------------------LOGIN--------------------");
        System.out.println("Enter user id:");
        user_id=Integer.parseInt(reader.readLine());

        if(L.checkUserId(user_id))
            {

        System.out.println("Enter password:");
        entered_password = reader.readLine();
            if(L.checkPassword(entered_password))
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
                    L.displayBook();
                    break;

                case 2:
                    System.out.println("enter the book isbn :");
                    try {
                        isbn = Integer.parseInt(reader.readLine());
                        System.out.println("enter the book user ID:");

                    } catch (IOException e) {
                        System.out.println("Invalid Entry, Re-try!!\t");
                    }

                    L.Reserve(isbn,user_id);
                    break;

                case 3:
                    System.out.println("enter the book isbn");
                    try {
                        isbn = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Nothing was Entered, Re-try!!\t");
                    }

                    L.Return(isbn);

                    break;

                case 4: exit(0);

                default: System.out.println("Invalid option");
                    break;

            }
        }while(choice!=4);


    }
            }

        else
                System.out.println("PLEASE CHECK IF U HAVE ENTERED CORRECT USERNAME AND PASSWORD. IF U DON'T HAVE AN ACCOUNT CONTACT THE LIBRARIAN");
}
}
