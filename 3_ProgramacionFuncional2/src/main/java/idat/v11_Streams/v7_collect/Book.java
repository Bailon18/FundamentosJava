package idat.v11_Streams.v7_collect;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private final String isbn;
    private final String title;
    private final int yearOfPublication;
    private final Genre genre;

    public Book(String isbn, String title, int yearOfPublication, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "genre=" + genre + ",   isbn=" + isbn
                + ",   title=" + title + ",   yearOfPublication="
                + yearOfPublication;
    }


    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, yearOfPublication, genre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (genre != other.genre)
            return false;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return yearOfPublication == other.yearOfPublication;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    

}
