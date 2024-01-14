package br.com.kontopp.APIJAVA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.kontopp.APIJAVA.Model.User;
import br.com.kontopp.APIJAVA.Model.UserRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api")
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping
	public Iterable<User> getUser(){
		
		return userRepo.findAll();
		
	}
	
	@PostMapping
	@RequestMapping(method = {RequestMethod.POST})
	public User userRegistration(@RequestBody User user) {
		userRepo.save(user);
		
		return user;
	}
}
