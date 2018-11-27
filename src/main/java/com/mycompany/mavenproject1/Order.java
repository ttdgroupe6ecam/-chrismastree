/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package christmastree;

/**
 * the class which stores client and order info.
 * @author mohamad
 *
 */
public class Order {

  private DeliveryAddress deliveryAddress = new DeliveryAddress();
  private Customer customer;
  private java.util.Date date = null;

  /**
   * ths constructor of the order class.
   * @param deliveryAddress the adress od delivery
   */
  public Order(Customer customer, String deliveryAddress) {
    this.deliveryAddress.setDeliveryAddress(deliveryAddress);
    this.customer = customer;
    this.date = new java.util.Date();
  }

  public void setDeliveryAdress(String address) {
    deliveryAddress.setDeliveryAddress(address);
  }

  public String getDeliveryAddress() {
    return deliveryAddress.getDeliveryAddress();
  }

  public void setName(String name) {
    this.customer.name = name;
  }

  public String getName() {
    return this.customer.name;
  }

  public void setSurname(String surname) {
    this.customer.surname = surname;
  }

  public String getSurname() {
    return this.customer.surname;
  }

  public java.util.Date getDate() {
    return this.date;
  }
}
