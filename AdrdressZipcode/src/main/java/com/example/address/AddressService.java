package com.example.address;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	public String getaddr(AddressModel add){
		return  add.getState()+ add.getCity()+ add.getCountry();
	}
}
