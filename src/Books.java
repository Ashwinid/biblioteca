public class Books {

    protected static  String book_name[]=new String[]{"Across Borders, Fifty-years of India’s Foreign Policy",
            "Adam Bede","Adhe Adhure\t\n","Adonis","Adrain Mole-The Wilderness Years"};
    protected static String author_name[]= new String[]{"J.N. Dixit","George Eliot","P.B.Mohan Rakesh","Shelley","Sue Townsend"};
    public static int no_of_copies[]=new int[]{3,2,4,0,1};






   public static String GetName(int i) {
        return book_name[i];
    }

    public static String GetAuthorName(int i) {
        return author_name[i];
    }
    public static int GetNumberOfCopies(int i){
                 return no_of_copies[i];
            }

        public  void Display()
        {
            System.out.println("Name\t\t\t\t\t\tAuthor");
            for(int i=0;i<5;i++)
            System.out.println(book_name[i]+"\t\t\t\t\t\t"+author_name[i]+"\n");
        }

    public  int Return(String str)   {
        for(int i=0;i<5;i++){
        if(book_name[i].equals(str))    {
          no_of_copies[i]+=1;
          return 1;
        }   }
        return 0;
    }


    public int Reserve(String str)
    {
        for(int i=0;i<5;i++){
        if(book_name[i].equals(str) && no_of_copies[i]>0) {

            no_of_copies[i]-=1;
            return 1;
        } }
        return 0;
            }




}