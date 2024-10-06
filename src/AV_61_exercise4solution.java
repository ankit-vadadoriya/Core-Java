class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("--> Available Books are : ");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
            for (int i = 0; i <= this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println(this.books[i] + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This boos does not exist");
    }

    void returnBook(String book){
        addBook(book);
        //-------------OR------------
//        this.books[no_of_books] = book;
//        no_of_books++;
    }
}

public class AV_61_exercise4solution {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Computer Science");
        centralLibrary.addBook("IELTS");
        centralLibrary.addBook("German A1");

        centralLibrary.showAvailableBooks();

        System.out.println("--------------issued books------------");
        centralLibrary.issueBook("C++");
        centralLibrary.issueBook("Algorithms");

        System.out.println("--------------return books------------");
        centralLibrary.returnBook("C++");

        System.out.println("--------------------------------------");
        centralLibrary.showAvailableBooks();
    }
}
