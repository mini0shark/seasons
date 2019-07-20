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
	private String password=null;
	private String birthday;
	private int phoneNumber;

public Client(String id, String name, String birthday, int phoneNumber) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
	}
//getter, setter
	public int getClientNumber() {return clientNumber;}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public void setClientNumber(int clientNumber) {this.clientNumber = clientNumber;}
	public String getBirthday() {return birthday;}
	public void setBirthday(String birthday) {this.birthday = birthday;}
	public int getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public boolean isPassword() {return password!=null;}
	public void setPassword(String password) {this.password = password;}
	public String getPassword() {return password;}
}
