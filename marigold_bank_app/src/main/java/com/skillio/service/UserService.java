package com.skillio.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.User;
import com.skillio.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	public User addUser(User user) {
		
		Random rand = new Random();
        


		boolean notUniqueAccNo = true;

		while(notUniqueAccNo) {
			int accountNo = rand.nextInt(10000);
			Optional<User> availableUser =  ur.findByAccNo(accountNo);
			
			if(!availableUser.isPresent()) {
				user.setAccNo(accountNo);
				notUniqueAccNo = false;
			}
		}
		
		user.setBalance(0);
		
		return ur.save(user);
	}

}
