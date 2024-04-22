package co.edu.usco.pw.service;

import java.util.List;

import co.edu.usco.pw.entity.Customer;
import co.edu.usco.pw.exception.ResourceNotFoundException;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId) throws ResourceNotFoundException;

	public void deleteCustomer(int theId) throws ResourceNotFoundException;
	
}
