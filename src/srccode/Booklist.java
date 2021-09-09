package srccode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asad Ali
 */
public class Booklist {

    public int id;
    public String isbn;
    public String name;
    public String author;
    public String coauthor;
    public int edition;
    public String publisher;
    public int pubyear;
    public int price;
    public int pages;

    public Booklist(int Id, String Isbn, String Name, String Author, String Coauthor, int Edition, String Publisher,
            int Pubyear, int Price, int Pages) {
        this.id = Id;
        this.isbn = Isbn;
        this.name = Name;
        this.author = Author;
        this.coauthor = Coauthor;
        this.edition = Edition;
        this.publisher = Publisher;
        this.pubyear = Pubyear;
        this.price = Price;
        this.pages = Pages;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getCoauthor() {
        return coauthor;
    }

    public int getEdition() {
        return edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPubyear() {
        return pubyear;
    }

    public int getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }
}
