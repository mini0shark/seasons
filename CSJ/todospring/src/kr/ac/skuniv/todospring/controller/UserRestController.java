package kr.ac.skuniv.todospring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.skuniv.todospring.dto.User;

@RestController
@RequestMapping("/users")
public class UserRestController {
	int index= 5;
	@GetMapping("/{id}")
	public User getUser(@PathVariable(name="id")int id) {
		//UserService를 통해서 id에 해당하는 값을 꺼내와서 리턴한다. 
		System.out.println(id);
		User user = new User();
		user.setId(id);
		user.setName("carami");
		
		return user;		
	}
	@GetMapping
	public List<User> getUsers(){
		//서비스로부터 userList를 얻어옴.
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("carami");
		User user2 = new User();
		user2.setId(2);
		user2.setName("carami2");
		User user3 = new User();
		user3.setId(3);
		user3.setName("carami3");
		users.add(user);
		users.add(user2);
		users.add(user3);
		return users;
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		//서비스를 이용해서 한건 저장하고 
		//저장한 데이터를 꺼내와서 리턴.. 
		
		user.setId(++index);
		return user;		
	}
}
