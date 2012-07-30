package com.tw28;

import java.io.IOException;

public class Library {
    Book[] B = new Book[5];
    Movie[] M= new Movie[15];
    User[] U=new User[5];

    public void initialize()
    {

    B[1].add(56343,"Across Borders","Adonis",reserved.yes);
    B[2].add(56342,"Fifty-years of India’s Foreign Policy","J.N. Dixit",reserved.no);
    B[3].add(56343, "Adam Bede","George Eliot",reserved.yes);
    B[4].add(56344,"Adhe Adhure","P.B.Mohan Rakesh",reserved.yes);
    B[5].add(56345,"Adrain Mole-The Wilderness Years","Sue Townsend",reserved.no);


    M[1].add("Scanners","David Cronenberg ","2");
    M[2].add(" Princess Mononoke" ,"Hayao Miyazaki","6");
    M[3].add("Requiem For A Dream","Darren Aronofsky","7");
    M[4].add("Opening Night", "John Cassavetes ", "8");
    M[5].add("Night On Earth", "Jim Jarmusch ", "3");
    M[6].add(" The Usual Suspects", "Bryan Singer", "N/A");
    M[7].add("The English Patient", "Anthony Minghella", "10");
    M[8].add("Insomnia", "Christopher Nolan ", "8");
    M[9].add("The Exorcist", "Curtis Hanson", "7");
    M[10].add("The Sweet Hereafter", "Christopher Nolan ", "N/A");
    M[11].add("All About Eve", "Atom Egoyan", "9");
    M[12].add("Bonnie And Clyde", "Joseph L Mankiewicz ", "4");
    M[13].add("Anna Christie" ,"Arthur Penn ","9");
    M[14].add(" The Last Picture Show", "Peter Bogdanovich", "6");
    M[15].add(" A Shot In The Dark", "Blake Edwards", "8");

    U[1].add(1111111,"biblioteca1","John","US, California,los Angeles",7990287);
    U[2].add(1111112, "biblioteca2", "henry", "Australia,New south wales, sydney", 5639234);
    U[3].add(1111113, "biblioteca3", "Raju", "India,Karnataka,Bangalore", 8975632);

    }

    public void displayBook()
    {
        System.out.println("ISBN -->> BOOK NAME -->> AUTHOR NAME -->> RESERVATION STATUS\n");
        for(int i=1;i<=5;i++)
            B[i].display();

    }

    public void displayMovie()
    {
        System.out.println("MOVIRE NAME -->> DIRECTOR NAME -->> RATING\n");
        for(int i=1;i<=15;i++)
            M[i].display();

    }

    public boolean checkUserId(int uid) {
        for(int i=1;i<=3;i++)
            if( new User().checkUserId(uid))
            {
                return true;

            }
        return false;
    }

    public boolean checkPassword(String entered_password) {
        for(int i=1;i<=3;i++)
            if( new User().checkPassword(entered_password))
            {
                return true;

            }
        return false;
    }

    public void Reserve(int isbn, int user_id) throws IOException {
           int flag=0;
        for(int i=1;i<=5;i++)
            flag=B[i].Reserve(isbn,user_id);
        if(flag==1)
            System.out.println("\nThank You! Enjoy the book\n");
        else
            System.out.println("\nSorry we dont have that book\n");
    }

    public void Return(int isbn) {
    int flag=0;

        for(int i=1;i<=5;i++)
            flag=B[i].Return(isbn);

        if(flag==1)
            System.out.println("\nBook re taken successfully\n");
        else
            System.out.println("Sorry! please talk to the librarian\n");
    }



    public boolean store(int user,int isbn) throws IOException {
        int flag=0;
        for(int i=0;i<3;i++)
        {
            if(new User().checkUserId(user))
            {
                flag=1;
                break;
            }

        }

        if(flag==0) {System.out.println("Invalid User ID");
        return false;
        }

        flag=0;
        for(int i=0;i<5;i++)
        {
            if(new Book().checkIsbn(isbn)){
               flag=1;
                break;
            }

        }
        if (flag==0) {
            System.out.println("Invalid ISBN");
            return false;
        }
         return true;
    }

}
