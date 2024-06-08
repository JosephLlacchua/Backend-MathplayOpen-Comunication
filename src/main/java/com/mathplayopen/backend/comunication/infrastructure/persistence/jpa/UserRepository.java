package com.mathplayopen.backend.comunication.infrastructure.persistence.jpa;

import com.mathplayopen.backend.comunication.domain.models.aggregates.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}