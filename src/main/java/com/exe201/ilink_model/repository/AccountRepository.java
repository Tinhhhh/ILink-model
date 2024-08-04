package com.exe201.ilink_model.repository;

import com.exe201.ilink_model.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}

