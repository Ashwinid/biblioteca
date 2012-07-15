import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;


public class BooksMain extends Books {
    public static int choice=0;
    public static int GetChoice() {
        return choice;  //To change body of created methods use File | Settings | File Templates.
    }
    public static void main(String[] args) throws IOException {
        Books B = new Books();
        String book_name = null;
        int flag;


        //B.book_name ="The Complete Reference Java";
        //B.author_name="Herbert Schildt";
        //B.no_of_copies=3;
          System.out.println("WELCOME TO PUBLIC LIBRARY SYSTEM\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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
                    System.out.println("enter the book name:");
                    try {
                        book_name = reader.readLine();
                    } catch (IOException e) {
                        System.out.println("Nothing was Entered, Re-try!!\t");
                    }

                            flag=B.Reserve(book_name);


                    if(flag==1) System.out.println("\nThank You! Enjoy the book\n");
                    else System.out.println("\nSorry we dont have that book\n");
                    break;

                case 3:
                    System.out.println("enter the book name:");
                    try {
                        book_name = reader.readLine();
                    } catch (IOException e) {
                        System.out.println("Nothing was Entered, Re-try!!\t");
                    }

                    flag=B.Return(book_name);


                    if(flag==1) System.out.println("\nBook re taken successfully\n");
                    else System.out.println("Sorry! please talk to the librarian\n");
                    break;

                case 4: exit(0);

                default: System.out.println("Invalid option");
                    break;

            }
        }while(choice!=4);


    }
}
