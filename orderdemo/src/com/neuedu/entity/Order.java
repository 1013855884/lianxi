package com.neuedu.entity;

import java.util.Date;

public class Order {
    private String orderId;
    private Integer status;
    private Integer meberId;
    private Date createTime;
    private Date updateTime;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMeberId() {
        return meberId;
    }

    public void setMeberId(Integer meberId) {
        this.meberId = meberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", status=" + status +
                ", meberId=" + meberId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
