package com.gokhanbilgin.core.utilities.adapters;

import org.springframework.stereotype.Service;

import com.gokhanbilgin.core.mernis.MernisVerification;
import com.gokhanbilgin.entities.concretes.User;

@Service
public class MernisServiceAdapter {
	public boolean verify(User user) {
		MernisVerification adapter = new MernisVerification();
		return adapter.verify(user);
	}
}
