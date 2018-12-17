package com.sda.gda17.demo.repository;

import com.sda.gda17.demo.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository <AppUser, Long> {
}
