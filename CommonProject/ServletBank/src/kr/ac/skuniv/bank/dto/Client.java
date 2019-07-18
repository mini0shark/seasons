package kr.ac.skuniv.bank.dto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Client {
	private int clientNumber;
	private String id;
	private String name;
	private String birthday;
	private int phoneNumber;
	
public Client(int clientNumber, String id, String name, String birthday, int phoneNumber) {
		this.clientNumber = clientNumber;
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
	}
//getter, setter
	public int getClientNumber() {return clientNumber;}
	public void setClientNumber(int clientNumber) {this.clientNumber = clientNumber;}
	public String getBirthday() {return birthday;}
	public void setBirthday(String birthday) {this.birthday = birthday;}
	public int getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}	
}
