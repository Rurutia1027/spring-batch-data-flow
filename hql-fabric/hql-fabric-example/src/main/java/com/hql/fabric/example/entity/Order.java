package com.hql.fabric.example.entity;

import com.hql.fabric.persistence.entity.Artifact;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = Order.TABLE)
public class Order extends Artifact {
    public static final String TABLE = "test_order";
    private String orderNo;

    // -- getter && setter --

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
