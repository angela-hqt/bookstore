package cn.angela.bookstore.book.domain;

import cn.angela.bookstore.category.domain.Category;

public class Book {
    private String bid;//主键
    private String bname;//图书商品名称
    private double price;//价格
    private String author;//作者
    private String image;//商品图片
    private Category category;//所属分类
    public String getBid() {
        return bid;
    }
    public void setBid(String bid) {
        this.bid = bid;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + ", author=" + author + ", image=" + image
                + ", category=" + category + "]";
    }
    
    
}
