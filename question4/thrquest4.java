class Product {
    String title;
    int releaseYear;
    double price;

    public Product(String title, int releaseYear, double price) {
        if (title.length() >= 255) title = title.substring(0, 254);
        if (releaseYear <= 1800 || releaseYear >= 2026) releaseYear = 2025; 
        
        this.title = title;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public void deskripsi() {
        System.out.println("Title: " + title);
        System.out.println("release Year: " + releaseYear);
        System.out.println("Price: " + (int)price);
    }
}

class Dvd extends Product {
    double runtime;
    public Dvd(String title, int year, double price, double runtime) {
        super(title, year, price);
        this.runtime = runtime;
    }
    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Runtime: " + (int)runtime + " minutes");
    }
}

class Magazine extends Product {
    String author;
    int numPages;
    public Magazine(String title, int year, double price, String author, int pages) {
        super(title, year, price);
        this.author = author;
        this.numPages = pages;
    }
    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numPages);
    }
}

class Vinyl extends Product {
    int size;
    public Vinyl(String title, int year, double price, int size) {
        super(title, year, price);
        this.size = size;
    }
    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Size in inches: " + size);
    }
}

// Main class untuk testing
public class thrquest4 {
    public static void main(String[] args) {
        Dvd d = new Dvd("Baby be Mine", 1982, 50000, 4);
        Magazine m = new Magazine("Nintendo Power #82", 1997, 25000, "Nintendo", 36);
        Vinyl v = new Vinyl("Song of The Wind", 1967, 350000, 12);

        d.deskripsi();
        m.deskripsi();
        v.deskripsi();
    }
}