package me.kzv.okvue.web.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Account signupWithLocalPlatform(){
        return null;
    }
}
