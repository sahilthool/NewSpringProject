package com.Bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Transaction_Details {
	
	int transaction_ID;
	int item_ID;
	int quantity;

}
