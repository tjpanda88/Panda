package org.panda.fw.blank.domain.repository;

import org.panda.fw.blank.domain.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountRepository {

	public Account getAccount(String userId) {
		return new Account(userId,"password",userId+"Name");
	}
}
