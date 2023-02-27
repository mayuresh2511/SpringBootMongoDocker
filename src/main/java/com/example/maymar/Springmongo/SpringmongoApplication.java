package com.example.maymar.Springmongo;

import com.example.maymar.Springmongo.entity.Address;
import com.example.maymar.Springmongo.entity.Gender;
import com.example.maymar.Springmongo.entity.Users;
import com.example.maymar.Springmongo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@SpringBootApplication
//public class SpringmongoApplication implements CommandLineRunner {
public class SpringmongoApplication{
		@Autowired
	private UsersRepository usersRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringmongoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		usersRepository.deleteAll();
//
//		Address address = new Address("India", "Panvel", 40206);
//
//		Users user = new Users("Mayuresh", "Marathe", "mayuresh.marathe123@gmail.com",
//				Gender.MALE, address, List.of("GL", "DEPOSIT"), 10000, LocalDate.now());
//
//		usersRepository.insert(user);
//
//	}
}
