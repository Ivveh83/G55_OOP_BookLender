package se.lexicon.model;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion

    static int sequencer;
    private int id = getNextId();
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getters and setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Other methods

    private static int getNextId(){
        return sequencer++;
    }

    public void loanBook(Book book){
        if (book.getAvailable()) {
            book.setBorrower(this);
            book.setAvailable(false);
        }else System.out.println("Book is not available");
    }

    public void returnBook(Book book){
        book.setBorrower(null);
        book.setAvailable(true);
    }


    public String getPersonInformation(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Id: " + getId())
                .append(", Name: " + getFirstName() + " " + getLastName());
        return stringBuilder.toString();
    }

}
