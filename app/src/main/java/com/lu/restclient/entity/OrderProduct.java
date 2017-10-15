package com.lu.restclient.entity;

/**
 * Created by lu on 10/14/17.
 */

public class OrderProduct {
    private String orderId;     //订单编号
    private String productId;   //商品编码
    private double price;       //单价
    private double quantity;    //数量
    private String plannedDeliveryTime; //计划到货时间

    public OrderProduct(){}

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getPlannedDeliveryTime() {
        return plannedDeliveryTime;
    }

    public void setPlannedDeliveryTime(String plannedDeliveryTime) {
        this.plannedDeliveryTime = plannedDeliveryTime;
    }
}