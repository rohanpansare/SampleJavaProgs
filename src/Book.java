import java.util.*;
abstract class Book
{
    String title;
    String author;
    int price;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

//Write MyBook Class
class MyBook extends   Book{
    public MyBook(String title,String author,int price){
        super(title,author);

        this.price = price;
}

    public void display(){
        System.out.println("Title: "+title+"\n"+"Author: "+author+"\n"+"Price: "+price);
    }



}

