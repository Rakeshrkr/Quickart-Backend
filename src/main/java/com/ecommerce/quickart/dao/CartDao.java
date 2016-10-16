package com.ecommerce.quickart.dao;

import java.util.List;

import com.ecommerce.quickart.model.Cart;

public interface CartDao {
	public Cart getCart(String userId,String productName) ;
	public Cart getCartbyId(String userId,int cartId) ;
	public Double getTotalRs(String userId);
	public void saveCart(Cart cart);
	public void updateCart(String userId);
	public void deleteCart(int  cartId);
	/*public void deleteCartItems(String userId);*/
	/*public int deleteCartItems1(String userId);*/
	public List<Cart> listCart(String userId);

}
