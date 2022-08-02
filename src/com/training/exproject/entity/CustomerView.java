package com.training.exproject.entity;

import java.util.List;

public class CustomerView {

	public void printCustomerWithCorrectCreditCardNumber(List<Customer> cust) {

		for (Customer custt : cust) {
			System.out.println("Full name:\t " + custt.getSurname() + " " + custt.getName() + " " + custt.getPatronymic()
					+ "\t 111111 < " + custt.getCreditCardNumber() + " < 777777\n");			
		}
	}
	
	public void printSortCustomerList(List<Customer> cust) {

		for (Customer custt : cust) {
			System.out.println("Full name:\t " + custt.getSurname() + " " + custt.getName() + " " + custt.getPatronymic());			
		}
	}

}
