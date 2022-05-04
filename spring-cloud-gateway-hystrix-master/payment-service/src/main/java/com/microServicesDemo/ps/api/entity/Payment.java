package com.microServicesDemo.ps.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;

    public int getPaymentId(){
        return this.paymentId;
    }

    public void setPaymentId(int id){
        this.paymentId = id;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amt){
        this.amount = amt;
    }

    public String getPaymentStatus(){
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
    }

    public int getOrderId(){
        return this.orderId;
    }

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    
    public String getTransactionId(){
        return this.transactionId;
    }

    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }
}
