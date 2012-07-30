package com.tw28;


import java.io.IOException;

public class Book {
        private  int isbn;
        private   String book_name;
        private  String author_name;
        private  reserved r;



    public void add(int i,String book_name,String author_name, reserved status)
    {
        isbn =i;
       this.book_name=book_name;
        this.author_name= author_name;
        r= status;

    }

    public  int Return(int isbn)   {
        for(int i=0;i<5;i++){
            if(this.isbn == isbn)    {
                r=reserved.no;
                return 1;
            }   }
        return 0;
    }


    public int Reserve(int isbn,int user_id) throws IOException {
        for(int i=0;i<5;i++){
            if( (this.isbn == isbn) && (r == reserved.no) && new Library().store(user_id, isbn)) {
                 r=reserved.no;
                return 1;
            } }
        return 0;
    }


    public void display() {
       System.out.println(isbn+" -->> "+book_name+" -->> "+ author_name+" -->> "+ r);
    }



    public boolean checkIsbn(int uid) {

        if(isbn%56000<999) // Checking if the ISBN is valid i.e, within range 56000-56999
        {
        for(int i=1;i<=3;i++)
            if( this.isbn== uid)
            {
                return true;

            }
        }
        else
        System.out.println("Invalid ISBN!!!!");

        return false;
    }

}




