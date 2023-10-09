class Book {
    int isbnNo;
    String bookName;
    String author;
    String genre;
    float price;

    public Book(int IsbnNo,String BookName,String Author,String Genre,float Price){
    isbnNo=IsbnNo;
    bookName=BookName;
    author=Author;
    genre=Genre;
    price=Price;
    }
    public void printBookDetails(){
        System.out.println("Books serial Number is: "+isbnNo);
        System.out.println("Book Name is: "+bookName);
        System.out.println("Author is: "+author);
        System.out.println("Book genre is: "+genre);
        System.out.println("Book price is: "+price);
    }
}



public class BookStoreImpl {
    public static void main(String[] args) {
    
   Book ts=new Book(123,"Two States","Chetan Bhagat","Romance",565.50F); 
   Book dune=new Book(125,"Dune","Frank Herbert","Fiction",1000.50F); 
   Book ps=new Book(128,"Ponniyan Selvan","Kalki Krishnamoorthy","Adventure",250.50F); 

   System.out.println("The Books are ");
    ts.printBookDetails();
    dune.printBookDetails();
    ps.printBookDetails();

   System.out.println("The cheapest Book is");
     if((ts.price<dune.price)&&(ts.price<ps.price))
     ts.printBookDetails();
     else if((dune.price<ts.price)&&(dune.price<ps.price))
     dune.printBookDetails();
     else
     ps.printBookDetails();

     
        
    }

}
