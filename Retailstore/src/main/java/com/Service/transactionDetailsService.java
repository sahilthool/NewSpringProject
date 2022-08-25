package com.Service;

import java.util.List;

import com.Bean.Cart;
import com.Bean.Transaction;
import com.Bean.Transaction_Details;

public interface transactionDetailsService {
	
	List<Transaction_Details> showalltransactionDetails();
	boolean addtransactionDetail(Transaction_Details trans_details);
	boolean deletetransactionDetail(int id);
	List<Transaction_Details> searchTransactionDetails(int transid);
	boolean deleteitemfromcart(int item_id);
	boolean updateitemquantity(int item_id, int quantity);
	boolean addToCart(Cart cart);
}
