package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BankModel;
import com.repo.BankRepo;

@Service
public class BankService {
	@Autowired
	BankRepo bankrepo;

	public List<String> getAllNames() {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		List<BankModel> b = bankrepo.findAll();
		for( BankModel itr:b)
		{
			names.add(itr.getAccount_Holder_Name());
			System.out.println();
		}
		
		return  names;
		
	}

}
