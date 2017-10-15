package com.lu.restclient.entity;

/**
 * Created by lu on 10/14/17.
 * Description: 订单实体类
 */

public class Order {
    private String orderId;         //订单编号
    private String ApplyDateTime;   //申请时间
    private String orderType;       //订单类型（普通流程/临时急需流程）
    private String reason;          //申请原因
    private String candidateSupplier;//候选供应商
    private String comment;         //备注
    private String attachments;     //附件
    private String plannedDeliveryTime;//计划到货时间

    public Order(){}
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getApplyDateTime() {
        return ApplyDateTime;
    }

    public void setApplyDateTime(String applyDateTime) {
        ApplyDateTime = applyDateTime;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCandidateSupplier() {
        return candidateSupplier;
    }

    public void setCandidateSupplier(String candidateSupplier) {
        this.candidateSupplier = candidateSupplier;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getPlannedDeliveryTime() {
        return plannedDeliveryTime;
    }

    public void setPlannedDeliveryTime(String plannedDeliveryTime) {
        this.plannedDeliveryTime = plannedDeliveryTime;
    }
}
