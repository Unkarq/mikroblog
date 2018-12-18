package com.sda.gda17.demo.repository;

import com.sda.gda17.demo.model.Wpis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WpisRepository extends JpaRepository <Wpis, Long> {
}
