package com.erano.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erano.account.dto.AccountDto;
import com.erano.account.dto.CreateAccountRequest;
import com.erano.account.service.AccountService;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

	private final AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService=accountService;
	}
	
	@PostMapping
	public ResponseEntity<AccountDto> createAccount(@RequestBody CreateAccountRequest request){
		return ResponseEntity.ok(accountService.createAccount(request));	
	}
}
