package com.example.corespringsecurityajax.repository;


import com.example.corespringsecurityajax.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Long> {

    Account findByUsername(String username);

}
