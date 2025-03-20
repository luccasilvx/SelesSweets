package com.leads.SelesSweets.repositories;

import com.leads.SelesSweets.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    UserDetails findByUsername(String username);

    boolean existsByEmail(String email);
}
