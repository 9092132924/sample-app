package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.AddressDTO;
import com.spring.demo.repo.AddressRepo;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepo addressRepo;

	@Override
	public AddressDTO getAddress(String address) {
		return addressRepo.findByFullAddress(address);
	}

}
