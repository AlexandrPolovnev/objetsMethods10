package objectsMethods;

import java.util.Objects;

public class Book {
    private final String authorName;
    private final int pageAmount;
    private final String publisherName;
    private int publicationYear;

    public Book(String authorName, int pageAmount, String publisherName, int publicationYear) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.publisherName = publisherName;
        this.publicationYear = publicationYear;
    }

    public String getAuthorName(){
        return authorName;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public int getPageAmount(){
        return pageAmount;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void  setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return
                authorName +
                ". Количество страниц " + pageAmount +
                ", Издательство " + publisherName  +
                ", год публикации " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return pageAmount == book.pageAmount && publicationYear == book.publicationYear && Objects.equals(authorName, book.authorName) && Objects.equals(publisherName, book.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, pageAmount, publisherName, publicationYear);
    }
}
