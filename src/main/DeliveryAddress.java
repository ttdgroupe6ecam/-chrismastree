/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author mohamad
 */
public class DeliveryAddress {
    String address;

    public DeliveryAddress(String deliveryAddress) {
        this.address = deliveryAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
