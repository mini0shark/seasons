package kr.ac.skuniv.bank.service;

import java.util.ArrayList;

import kr.ac.skuniv.bank.dao.BankBookDAO;
import kr.ac.skuniv.bank.dto.BankBook;

public class BankBookService {

	public static final int PRE_PROCESS = -1;
	public static final int SUCCESS = 0;
	public static final int NO_ACCOUNT_EXIST = 1000;
	public static final int NO_SENDERS_ACCOUNT_EXIST= 1001;
	public static final int NO_GETTERS_ACCOUNT_EXIST= 1002;
	public static final int NOT_ENOUGH_VALANCE = 2000;
	public static final int NO_PROPER_MONEY_INSERTED = 3000;
	public static final int ACCOUNT_ALREADY_EXIST = 4000;
	public static final int FAILED_FROM_DB = 9000;

	BankBookDAO dao = new BankBookDAO();
	//입금
	public int depositMoney(int accountNumber, int money) {
		boolean result= false;
		BankBook bankBook = dao.selectBankBook(accountNumber);
		if(money<0)
			return NO_PROPER_MONEY_INSERTED;
		if(bankBook == null) {
			return NO_ACCOUNT_EXIST;
		}
		bankBook.setValance(bankBook.getValance());
		dao.updateBankBook(bankBook);
		return SUCCESS;
	}

	//출금
	public int withDrawMoney(int accountNumber, int money) {
		BankBook bankBook = dao.selectBankBook(accountNumber);
		if(money<0)
			return NO_PROPER_MONEY_INSERTED;
		if(bankBook == null)
			return NO_ACCOUNT_EXIST;
		int valance = bankBook.getValance();
		if(valance-money<0) {
			return NOT_ENOUGH_VALANCE;
		}
		bankBook.setValance(bankBook.getValance()-money);
		dao.updateBankBook(bankBook);
		return SUCCESS;

	}

	//송금
	public int sendMoney(int senderAccount, int getterAccount,int money){
		BankBook sendersBook = dao.selectBankBook(senderAccount);
		BankBook gettersBook = dao.selectBankBook(getterAccount);
		if(money<0)
			return NO_PROPER_MONEY_INSERTED;
		if(sendersBook==null) return NO_SENDERS_ACCOUNT_EXIST;
		if(gettersBook==null) return NO_GETTERS_ACCOUNT_EXIST;

		if(withDrawMoney(senderAccount, money)!=SUCCESS) {
			return NOT_ENOUGH_VALANCE;
		}
		gettersBook.setValance(gettersBook.getValance()+money);
		dao.updateBankBook(gettersBook);
		return SUCCESS;
	}

	//통장 삭제
	public int removeBankBook(int accountNumber) {
		if(!dao.checkAccountExistance(accountNumber))
			return NO_ACCOUNT_EXIST;
		if(dao.deleteBankBook(accountNumber))
			return SUCCESS;
		return FAILED_FROM_DB;
	}
	//통장 추가
	public int createBankBook(int accountNumber, int valance, String password, int clientNumber, String clientName) {
		BankBook bankBook = new BankBook(accountNumber, valance, password, clientNumber, clientName);
		if(!dao.checkAccountExistance(accountNumber))
			return ACCOUNT_ALREADY_EXIST;
		if(dao.insertBankBook(bankBook))
			return SUCCESS;
		return FAILED_FROM_DB;
	}

	//본인 통장 목록 조회
	public ArrayList<BankBook> getAccounts(int clientNumber, String clientName) {
		return dao.selectBankBook(clientNumber, clientName);
	}

	//본인의 특정 통장 조회
	public BankBook getAccounts(int accountNumber) {
		return dao.selectBankBook(accountNumber);
	}

}
