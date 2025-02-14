package com.mainpage.bean;
import java.io.Serializable;

/*
* 实现 Serializable 接口是为了使对象可以进行序列化，即将对象的状态转换为字节流，以便在网络上传输或者持久化到文件系统或数据库中。
* 在 Java 中，实现 Serializable 接口是一种标记接口，没有需要实现的方法，只是为了表明该类的对象是可序列化的。
*
* */
public class Book implements Serializable {
    private Integer id;        //图书编号
    private String name;       //图书名称
    private String isbn;       //图书标准ISBN编号
    private String press;      //图书出版社
    private String author;     //图书作者
    private Integer pagination;//图书页数
    private Double price;      //图书价格
    private String uploadTime; //图书上架时间
    private String status;     //图书状态
    private String borrower;   //图书借阅人
    private String borrowTime; //图书借阅时间
    private String returnTime; //图书预计归还时间

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isbn='" + isbn + '\'' +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                ", pagination=" + pagination +
                ", price=" + price +
                ", uploadTime='" + uploadTime + '\'' +
                ", status='" + status + '\'' +
                ", borrower='" + borrower + '\'' +
                ", borrowTime='" + borrowTime + '\'' +
                ", returnTime='" + returnTime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getPress() {
        return press;
    }
    public void setPress(String press) {
        this.press = press;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getPagination() {
        return pagination;
    }
    public void setPagination(Integer pagination) {
        this.pagination = pagination;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getUploadTime() {
        return uploadTime;
    }
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBorrower() {
        return borrower;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public String getBorrowTime() {
        return borrowTime;
    }
    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }
    public String getReturnTime() {
        return returnTime;
    }
    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
}
