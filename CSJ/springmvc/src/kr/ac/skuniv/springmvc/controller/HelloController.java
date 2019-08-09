package kr.ac.skuniv.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.skuniv.springmvc.dto.Member;

@Controller
public class HelloController {
	public HelloController() {
		System.out.println("HelloController 생성~~~~");
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	/*@RequestMapping(name="/ttt")
	public String test(Model model) {
		String name = "kang kyungmi";
		model.addAttribute("name", name);
		return "test";
	}*/
	
	@RequestMapping("/inputName")
	public String name(String name,Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "inputName";
	}
	
	@GetMapping("/memberForm")
	public String memberForm() {
		return "memberForm";
	}
	
	@PostMapping("/memberSave")
	public String memberSave(Member member ) {
		System.out.println(member.getName());
		return "redirect:hello";
	}
	
}
