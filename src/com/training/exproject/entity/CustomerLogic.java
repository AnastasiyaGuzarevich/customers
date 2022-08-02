package com.training.exproject.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public boolean creditCardNumber(Customer cust) {
		int creditCardNumber = cust.getCreditCardNumber();

		if (111111 < creditCardNumber && creditCardNumber < 777777) {
			return true;
		}
		return false;
	}

	public List<Customer> listCustomerWithCorrectCreditCardNumber(List<Customer> customer) {
		List<Customer> result = new ArrayList<Customer>();

		for (Customer custt : customer) {
			if (creditCardNumber(custt)) {
				result.add(custt);
			}
		}

		return result;
	}

	public List<Customer> sortedCustomerList(List<Customer> customer) {	
		List<Customer> result = new ArrayList<Customer>();

		for (int i = 0; i < customer.size(); i++) {
			Customer min = customer.get(i);
			int index = i;

			for (int j = i + 1; j < customer.size(); j++) {
				if (min.getSurname().compareTo(customer.get(j).getSurname()) > 0) {
					min = customer.get(j);
					index = j;
				}
			}

			Customer temp = customer.get(i);
			customer.set(i, customer.get(index));
			customer.set(index, temp);
			result.add(customer.get(i));
		}
		
		return result;
	}
}
