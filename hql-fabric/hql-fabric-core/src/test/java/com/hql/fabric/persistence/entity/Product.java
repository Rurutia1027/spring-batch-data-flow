package com.hql.fabric.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = Product.TABLE)
public class Product extends BaseEntity {
    public static final String TABLE = "test_product";

    private String productNo;

    // -- getter && setter --

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }
}
