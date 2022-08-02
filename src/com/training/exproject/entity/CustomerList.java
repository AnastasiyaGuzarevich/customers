package com.training.exproject.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerList {

	private List<Customer> customer;

	public CustomerList() {
		customer = new ArrayList<Customer>();
	}

	public void add(Customer cust) {
		customer.add(cust);
	}
	

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		return Objects.equals(customer, other.customer);
	}

	@Override
	public String toString() {
		return "CustomerList [customer=" + customer + ", getCustomer()=" + getCustomer() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
