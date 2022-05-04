package com.microServicesDemo.os.api.common;

import com.microServicesDemo.os.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order order;
    private Payment payment;

    public TransactionRequest(Order order, Payment payment){
        this.order = order;
        this.payment = payment;
    }

    public Order getOrder(){
        return this.order;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public Payment getPayment(){
        return this.payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }
}
