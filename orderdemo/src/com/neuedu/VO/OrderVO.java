package com.neuedu.VO;

import com.neuedu.enumeration.OrderStatusEnum;

import java.util.Date;

public class OrderVO {
    private String orderId;
    private OrderStatusEnum status;
    private Integer meberId;
    private Date createTime;
    private Date updateTime;

    public OrderVO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderStatusEnum status) {
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
        return "OrderVO{" +
                "orderId='" + orderId + '\'' +
                ", status=" + status +
                ", meberId=" + meberId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
