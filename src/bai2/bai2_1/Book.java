package bai2.bai2_1;

public class Book {
    private String name;
    private Author author;
    private double price ;
    private int qty=0;
    public Book(String name, Author Author, double price, int qty){
        this.name=name;
        this.author=Author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Author getAuthor() {
        return author ;
    }
    public void setAuthor(Author Author){
        this.author= Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price ){
        this.price=price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Athor=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
