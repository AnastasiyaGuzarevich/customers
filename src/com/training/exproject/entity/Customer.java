package com.training.exproject.entity;

import java.util.Objects;

//Создать класс Customer, спецификация которого приведена ниже. 
//Определить конструкторы, set- и get- методы и метод  toString(). 
//Создать второй класс, агрегирующий (включающий) коллекцию типа Customer, 
//с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль. 

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
//Найти и вывести: 
//a) список покупателей в алфавитном порядке; 
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {

		id = 0;
		surname = "";
		name = "";
		patronymic = "";
		address = "";
		creditCardNumber = 0;
		bankAccountNumber = 0;

	}

	public Customer(int id, String surname, String name, String patronymic, String address, int creditCardNumber,
			int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankAccountNumber, creditCardNumber, id, name, patronymic, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && bankAccountNumber == other.bankAccountNumber
				&& creditCardNumber == other.creditCardNumber && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(patronymic, other.patronymic) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

	

	
}
