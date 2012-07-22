package com.tw28;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Borrower implements BookInterface,UserInterface {
    int user_id,book_isbn,flag=0;

    public boolean store(int user,int isbn) throws IOException {
     for(int i=0;i<3;i++)
     {
     if(UserInterface.User_id[i]==user)
     {user_id=user; flag=1;
       break;
     }
     }
     if(flag==0) {System.out.println("Invalid User ID");  return false;
     }

        flag=0;
     for(int i=0;i<5;i++)
     {
        if(BookInterface.isbn[i]== isbn){
         book_isbn=isbn;   flag=1;
            break;
        }

     }
        if (flag==0) {
              System.out.println("Invalid ISBN"); return false;
        }


        String str= String.valueOf(user_id+book_isbn);

        FileWriter fw=new FileWriter("Borrower.dat",true);
        BufferedWriter Bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(Bw);
        pw.println(str);

        Bw.close();
        fw.close();
        pw.close();
         return true;
            }

    }