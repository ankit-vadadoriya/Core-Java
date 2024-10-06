/*
create a library management system which is capable of issue books to the students
Book should have info like:
1. Book name
2. Book author
3. Issued to
4. Issued on
User should be able to add books, return issued books, issue books
Assume that all the users are registered with their names in the central database
 */

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book){
        System.out.println("The book has been added in the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been return");
        this.books.add(b);
    }

}

public class AV_104_library_management {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithams1", "CLRS1");
        bk.add(b1);
        Book b2 = new Book("Algorithams2", "CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorithams3", "CLRS3");
        bk.add(b3);
        Book b4 = new Book("Algorithams4", "CLRS4");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);
        System.out.println(l.books);
        l.issueBook(b3, "Ankit");
        System.out.println(l.books);

        l.returnBook(b3);
        System.out.println(l.books);
    }
}
