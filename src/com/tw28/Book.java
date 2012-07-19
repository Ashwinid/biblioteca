package com.tw28;


import java.io.IOException;

public class Book extends Borrower implements BookInterface {

    public  String GetName(int i) {
        return book_name[i];
    }

    public  String GetAuthorName(int i) {
        return author_name[i];
    }
    public  int GetIsbn(int i){
        return isbn[i];
    }

    public  reserved GetReserveStatus(int i){
        return r[i];
    }

    public  void Display()
    {
        System.out.println("ISBN\t\t\t\t\t\tName\t\t\t\t\t\tAuthor");
        for(int i=0;i<5;i++)
            System.out.println(book_name[i]+"\t\t\t\t\t\t"+author_name[i]+"\n");
    }

    public  int Return(int x)   {
        for(int i=0;i<5;i++){
            if(isbn[i] == x)    {
                r[i]=reserved.no;
                return 1;
            }   }
        return 0;
    }


    public int Reserve(int x,int user_id) throws IOException {
        for(int i=0;i<5;i++){
            if( (isbn[i] == x) && (r[i] == reserved.no) && store(user_id, x)) {
                 r[i]=reserved.no;
                return 1;
            } }
        return 0;
    }




}




