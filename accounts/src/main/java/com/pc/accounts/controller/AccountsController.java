package com.pc.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pc.accounts.constants.AccountsConstants;
import com.pc.accounts.dto.ResponseDto;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
@AllArgsConstructor
public class AccountsController {

	public ResponseEntity<ResponseDto> createAccount() {
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
	}
	
	

}
