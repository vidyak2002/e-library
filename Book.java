package Training;

public class Book {
    int bookNumber;
    String name;
    String author;
    Concept[] concepts;
    public Book(int bookNumber, String name, String author, Concept[] concepts) {
        this.bookNumber = bookNumber;
        this.name = name;
        this.author = author;
        this.concepts = concepts;
    }


    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Concept[] getConcepts() {
        return concepts;
    }

    public void setConcepts(Concept[] concepts) {
        this.concepts = concepts;
    }
}
