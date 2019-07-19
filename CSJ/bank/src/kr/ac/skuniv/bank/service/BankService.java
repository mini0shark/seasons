package kr.ac.skuniv.bank.service;

import kr.ac.skuniv.bank.dao.BankDAO;
import kr.ac.skuniv.bank.dto.Bank;


public class BankService {
	BankDAO dao = new BankDAO();
	
	public boolean login(String id, String password) {
		boolean loginFlag = false;
		Bank bank = dao.getBank(id);
		if(bank != null && bank.getPassword().equals(password)) {
			loginFlag = true;
		}
		
		return loginFlag;
	}
	
	public Bank getBank(String id) {
		return dao.getBank(id);
	}
	
}
