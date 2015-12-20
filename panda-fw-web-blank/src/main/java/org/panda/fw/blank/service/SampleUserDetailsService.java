package org.panda.fw.blank.service;

import org.dozer.inject.Inject;
import org.panda.fw.blank.domain.model.Account;
import org.panda.fw.blank.domain.model.SampleUserDetails;
import org.panda.fw.blank.domain.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SampleUserDetailsService implements UserDetailsService {

	@Autowired
	AccountRepository accountRepository = null;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		try {
            Account account = accountRepository.getAccount(username); // (3)
            return new SampleUserDetails(account); // (4)
        } catch (Exception e) {
            throw new UsernameNotFoundException("user not found", e); // (5)
        }
	}



}
