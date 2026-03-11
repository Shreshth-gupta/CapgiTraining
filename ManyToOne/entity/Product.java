package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

//@Entity
@Table(name = "productData")
public class Product {
    @Id
    @Column(name = "product_id")
//    @GeneratedValue(strategy = GenerationType.AUTO) ->to auto generate the id
    private int pid;
    @Column(name = "product_name", nullable = false)
    private String name;
    @Column(name = "product_price")
    private double price;
    @Column(name = "product_qty")
    private int qty;
    @Column(name = "product_dom")
    private LocalDate dom;

    public Product() {
    }

    public Product(int id, String name, double price, int qty, LocalDate dom) {
        this.pid = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDom() {
        return dom;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getPid() {
        return pid;
    }
}
