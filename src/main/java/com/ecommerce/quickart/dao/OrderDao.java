package com.ecommerce.quickart.dao;

import java.util.List;

import com.ecommerce.quickart.model.BillingAddress;
import com.ecommerce.quickart.model.Cart;
import com.ecommerce.quickart.model.Order;
import com.ecommerce.quickart.model.ShippingAddress;

public interface OrderDao {
	public List<Order> orderListofUser(String userId) ;
	public void saveorupdate(Order order) ;
	public void update(Order order) ;
	/*public String delete(int orderId);*/
	public Order get(String userId);
	public Long getTotalRs(String userId);
}
