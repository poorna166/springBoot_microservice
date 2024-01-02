package com.pc.accounts.service;

import com.pc.accounts.dto.CustomerDto;

public interface IAccountsService {

	/*
	 * @param customer accepts customerdto
	 */

	void createAccount(CustomerDto customerDto);

	public CustomerDto fetchAccount(String mobileNumber);

	public boolean updateAccount(CustomerDto customerDto);

	public boolean deleteAccount(String mobileNumber);

}
