package com.training.exproject.entity;

import java.util.List;

//Создать класс Customer, спецификация которого приведена ниже. 
//Определить конструкторы, set- и get- методы и метод  toString(). 
//Создать второй класс, агрегирующий (включающий) коллекцию типа Customer, 
//с подходящими конструкторами и методами. 
//Задать критерии выбора данных и вывести эти данные на консоль. 

//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
//Найти и вывести: 
//a) список покупателей в алфавитном порядке; 
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class MainC {

	public static void main(String[] args) {

		CustomerList customer = new CustomerList();

		customer.add(new Customer(1234, "Ivanov", "Sergey", "Ivanovich", "BY, 220033, g-Pinsk, ul-Lenina, d-1", 354655,
				11111));
		customer.add(new Customer(2121, "Kozlov", "Oleg", "Olegovich", "BY, 221222, g-Ivanovo, ul-Zelenaya, d-11",
				100120, 33333));
		customer.add(new Customer(3232, "Sobol", "Ivan", "Vladimirovich", "BY, 222222, g-Stolin, yl-Yasnaya, d-10",
				553341, 55555));
		customer.add(new Customer(1111, "Derevenya", "Yuriy", "Sergeevich",
				"BY, 202301, g-Soligorsk, yl-Ryabinovaya, d-1", 959566, 77777));
		customer.add(new Customer(2222, "Gorb", "Sidor", "Ivanovich", "BY, 202301, g-Lida, yl-Vesennyaya, d-8", 888874,
				88888));
		customer.add(new Customer(4545, "Poleychik", "Sergey", "Fedorovich",
				"BY, 202301, g-Drogichin, yl-Novoselskaya d-7", 754142, 25254));

		
		CustomerLogic logic = new CustomerLogic();

		List<Customer> result = logic.listCustomerWithCorrectCreditCardNumber(customer.getCustomer());
        List<Customer> sort = logic.sortedCustomerList(customer.getCustomer());
        
		CustomerView view = new CustomerView();

		view.printCustomerWithCorrectCreditCardNumber(result);
		view.printSortCustomerList(sort);
		
		

	}

}
