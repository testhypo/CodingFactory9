package gr.aueb.cf.cf9.ch15.marker;

public class Product {

    private int id;
    private String titlel;

    public Product () {

    }

    public Product(int id, String titlel) {
        this.id = id;
        this.titlel = titlel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlel() {
        return titlel;
    }

    public void setTitlel(String titlel) {
        this.titlel = titlel;
    }
}
