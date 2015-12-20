package org.panda.fw.blank.domain.model;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

public class SampleUserDetails extends User {

	private final Account account; // (2)

    public SampleUserDetails(Account account) {
        // (3)
        super(account.getUserId(), account.getPassword(), AuthorityUtils
                .createAuthorityList("ROLE_USER")); // (4)
        this.account = account;
    }

    public Account getAccount() { // (5)
        return account;
    }
}
