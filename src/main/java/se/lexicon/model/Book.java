package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id = getNextId();
        setAvailable(true);
    }

    public Book(String title, String author, Person borrower){
        this.title = title;
        this.author = author;
        this.borrower = borrower;
        this.id = getNextId();
        setAvailable(false);
    }

    //Getters and setters


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailable() {
        return available;
    }

    public Person getBorrower(){
        return borrower;
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()){
            throw new IllegalArgumentException("Not allowed to be null or empty");
        }
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower){
        this.borrower = borrower;
    }

    //Other Methods

    public String getBookInformation(){
        StringBuilder stringBuilder = new StringBuilder();
        String firstName;
        String lastName;
        try {
            firstName = getBorrower().getFirstName();
            lastName = getBorrower().getLastName();
        }catch (NullPointerException e){
            firstName = null;
            lastName = "";
        }
        stringBuilder.append("Id: " + getId())
                .append(", Title: " + getTitle())
                .append(", Author: " + getAuthor())
                .append(", Available: " + getAvailable())
                .append(", Borrower: " + firstName + " " + lastName);

        return stringBuilder.toString();
    }

    public String getNextId(){
        String string = "";
        for (int i = 0; i < 3; i++){
            string += (char)(Math.random()*26+65);
        }
        for (int i = 0; i < 3; i++){
            string += (char)(Math.random()*10+48);
        }

        return string;
    }

}