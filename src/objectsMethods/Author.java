package objectsMethods;

import java.util.Objects;

public class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    @Override
    public String toString(){
        return authorName;
        }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return Objects.equals(authorName, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
}
