/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 * the class which stores client and order info.
 * @author mohamad
 *
 */
public class Order {

  private  DeliveryAddress deliveryAddress;
  private Customer customer;
  private java.util.Date date = null;

  /**
   * ths constructor of the order class.
   * @param deliveryAddress the adress od delivery
   * @param Customer contains the  name and surname of the client
   */
  public Order(DeliveryAddress deliveryAddress, Customer customer) {

    this.date = new java.util.Date();
    deliveryAddress.setAddress(deliveryAddress.getAddress());
    customer.setName(customer.getName()); 
    customer.setSurname(customer.getName()); 
  }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


  public java.util.Date getDate() {
    return this.date;
  }
}
