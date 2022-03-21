
package entidades;

import java.util.Comparator;
import java.util.Date;

public class Libro {
    private int ISBN;
    private String title;
    private String author;
    private Date releaseDate;

    public Libro() {
    }

    public Libro(int ISBN, String title, String author, Date releaseDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", releaseDate=" + releaseDate + '}';
    }
    
    public static Comparator<Libro> compararLibro = new Comparator<Libro>() {
        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.getReleaseDate().compareTo(l2.getReleaseDate());
        }
    };
}
