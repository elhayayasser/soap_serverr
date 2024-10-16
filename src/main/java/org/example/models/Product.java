package org.example.models;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private Integer code;
    private String name;
    private double price;
    @XmlTransient
    private Date DateCreation;

    public Product() {
    }

    public Product(Integer code, String name, double price, Date dateCreation) {
        this.code = code;
        this.name = name;
        this.price = price;
        DateCreation = dateCreation;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateCreation() {
        return DateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        DateCreation = dateCreation;
    }
}
