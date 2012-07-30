package com.tw28;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Transaction {
    int user_id,book_isbn;

    public boolean store(int user,int isbn) throws IOException {
        if(new Library().store(user,isbn))
        {
        user_id=user;
        book_isbn=isbn;


        String str= String.valueOf(user_id+book_isbn);

        FileWriter fw=new FileWriter("BookRepository.dat",true);
        BufferedWriter Bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(Bw);
        pw.println(str);

        Bw.close();
        fw.close();
        pw.close();
        return true;
            }
        return false;

    }
}