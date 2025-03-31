package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book
        Person joakimVonAnka = new Person("Joakim", "von Anka");
        Person kalleAnka = new Person("Kalle", "Anka");
        Book book = new Book("Sagan om Ringen", "JRR Tolkien");
        System.out.println(joakimVonAnka.getPersonInformation());
        System.out.println(kalleAnka.getPersonInformation());
        System.out.println(book.getBookInformation());
        System.out.println("""
        Farbror Joakim lånar en bok
        Ny bokstatus:""");
        joakimVonAnka.loanBook(book);
        System.out.println(book.getBookInformation());
        System.out.println("Kalle försöker låna boken, men får meddelandet:");
        kalleAnka.loanBook(book);
        System.out.println("Kvack!!!");
        System.out.println("""
                Joakim lämnar tillbaka boken
                Ny bokstatus:""");
        joakimVonAnka.returnBook(book);
        System.out.println(book.getBookInformation());
        System.out.println("""
        Kalle försöker låna boken igen
        Ny bokstatus:""");
        kalleAnka.loanBook(book);
        System.out.println(book.getBookInformation());
    }

}
