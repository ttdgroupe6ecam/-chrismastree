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

  private String deliveryAddress;
  /*private String name;
  private String surname;*/
  private Customer customer;
  private java.util.Date date = null;

  /**
   * ths constructor of the order class.
   * @param deliveryAddress the adress od delivery
   * @param name name of the client
   * @param surname surname of the client
   */
  public Order(String deliveryAddress, Customer customer) {

    this.date = new java.util.Date();
    this.deliveryAddress = deliveryAddress;
    customer.setName(customer.getName()); 
    customer.setSurname(customer.getName()); 
  }

  public void setDeliveryAdress(String address) {
    this.deliveryAddress = address;
  }

  public String getDeliveryAddress() {
    return this.deliveryAddress;
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
