package com.cos.blog.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class DummycontrollerTest {
	
	@Autowired  //의존성 주입
	private UserRepository userrepository;
	
	//http://localhost:8000/blog/dummy/join (요청)
	
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("id:"+user.getId());
		System.out.println("username : "+ user.getUsername());
		System.out.println("password : "+ user.getPassword());
		System.out.println("email : "+ user.getEmail());
		System.out.println("role : "+ user.getRole());
		System.out.println("createDate : "+ user.getCreateDate());
		
		userrepository.save(user);
		return "회원가입이 완료되었습니다.";
	}
}
