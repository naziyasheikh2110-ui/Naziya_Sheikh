package java_projects;
/**
 * Online_Library class simulates an online library system.
 */
class Library{
    int no_of_books;
    String[] books;
    Library(){
            this.no_of_books = 0;
            this.books = new String[100];
        }
        void addBook(String book) {
            this.books[no_of_books] = book;
            no_of_books++;
            System.out.println("* "+ book);
        }
        void showAvailableBooks(){
                System.out.println("Available Books are: ");
                for(String book : this.books){
                    if(book == null){
                        continue;
                    }
                    System.out.println("* "+ book);
                }
            }
        void issueBook(String book){   // boos issuesd by a person
        for(int i=0;i<no_of_books;i++){
            if( this.books[i].equals(book)){
                System.out.println(book+ " been issued!!");
                this.books[i]= null;
                return;
            }
        }
            System.out.println("this book does not exist");
    }

        void returnBook(String book){
        addBook(book);
            System.out.println(book +" has been returned");
        }
}


public class Online_Library {
    public static void main(String[] args) {
        Library L = new Library();
        System.out.println("The added books are: ");
        L.addBook("Think and Grow ");
        L.addBook("Learn Java");
        L.addBook("Algorithm ");
        L.addBook("Data Science ");
        L.addBook("how to start programming ");
        L.addBook("Its all about you ");

        L.issueBook("Learn Java");
        L.showAvailableBooks();

        L.returnBook("Learn Java");
        L.showAvailableBooks();
    }
}
