package com.microServicesDemo.os.api.common;

import com.microServicesDemo.os.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;

    public TransactionResponse(Order order, double amount, String transactionId, String message){
        this.order = order;
        this.amount = amount;
        this.transactionId = transactionId;
        this.message = message;
    }

    public Order getOrder(){
        return this.order;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amt){
        this.amount = amt;
    }

    public String getTransactionId(){
        return this.transactionId;
    }

    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }

    public String getmessage(){
        return this.message;
    }

    public void setMessage(String msg){
        this.message = msg;
    }

}
