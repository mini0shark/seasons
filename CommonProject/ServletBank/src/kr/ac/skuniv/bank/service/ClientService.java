package kr.ac.skuniv.bank.service;

import java.util.ArrayList;

import kr.ac.skuniv.bank.dao.BankBookDAO;
import kr.ac.skuniv.bank.dao.ClientDAO;
import kr.ac.skuniv.bank.dto.BankBook;
import kr.ac.skuniv.bank.dto.Client;

public class ClientService {

	public static final int PRE_PROCESS = -1;
	public static final int SUCCESS = 1000;
	public static final int NO_ACCOUNT_EXIST = 0;
	public static final int NO_SENDERS_ACCOUNT_EXIST= 1;
	public static final int NO_GETTERS_ACCOUNT_EXIST= 2;
	public static final int NOT_ENOUGH_VALANCE = 3;
	public static final int NO_PROPER_MONEY_INSERTED = 4;
	public static final int ID_ALREADY_EXIST = 5;
	public static final int FAILED_FROM_DB = 6;
	public static final String[] ERROR = {"계정이 존재하지 않습니다.", "발신자의 계정이 존재하지 않습니다.","수신자의 계정이 존재하지 않습니다.","계좌에 잔액이 부족합니다.",
			"잘못된 금액이 입금되었습니다. 확인후 다시 넣어주세요", "동일한 계정이 존재합니다.","데이터베이스 오류입니다. 관리자에게 문의하세요"};

	ClientDAO dao = new ClientDAO();
	//회원정보 수정
	public int changeInfomation(Client alteredClient) {
		if(dao.selectClient(alteredClient.getId())== null)
			return NO_ACCOUNT_EXIST;
		if(dao.updateClient(alteredClient))
			return SUCCESS;
		return FAILED_FROM_DB;
	}

	//계정 삭제
	public int removeClient(String id) {
		if(!dao.checkAccountExistance(id))
			return NO_ACCOUNT_EXIST;
		if(dao.deleteClient(id))
			return SUCCESS;
		return FAILED_FROM_DB;
	}
	//계정 추가
	public int createClient(String id, String name, String password,String birthday, int phoneNumber){
		if(dao.checkAccountExistance(id))
			return ID_ALREADY_EXIST;
		if(dao.insertClient(id,name, password, birthday, phoneNumber))
			return SUCCESS;
		return FAILED_FROM_DB;
	}

	//계정 목록 조회(전체)
	public ArrayList<Client> getClients() {
		return dao.selectClient();
	}

	//계정조회
	public Client getAccounts(String id) {
		return dao.selectClient(id);
	}
	
	//자신명의의 통장 확인
	public ArrayList<BankBook> showMyBankBookList(String id){
		BankBookDAO bbDao = new BankBookDAO();
		return bbDao.selectBankBook(id);
	}
	//로그인시 고객 확인
	public boolean checkClientExist(String id) {
		return dao.checkAccountExistance(id);
	}
	public String getClientNameWithId(String id) {
		return dao.getClientNameWithId(id);
	}


}
