package kr.ac.skuniv.springmvc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class Member {
	private String name;
	private String id;
	private String password;
	private String email;	
}
