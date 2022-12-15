package chapter7;

public class Book {
    public Book(int price, String title, String coverType, int quantityOfPages){
        setPrice(price);
        setTitle(title);
        setCoverType(coverType);
        setQuantityOfPages(quantityOfPages);
    }

    double price;
    String title;
    String coverType;
    int quantityOfPages;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        if(coverType.equals("hard") || coverType.equals("soft")) {
            this.coverType = coverType;
        } else System.out.println("The cover can be ether hard or soft! Please, enter the correct type.");
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

}
