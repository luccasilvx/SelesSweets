package com.leads.SelesSweets.services.dashboard;

import com.leads.SelesSweets.models.User;
import com.leads.SelesSweets.models.projection.UserProjection;
import com.leads.SelesSweets.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService implements UserProjection {

    @Autowired
    private UserRepository repository;


    @Override
    public User create(User userToCreate) {
        if (repository.existsByEmail(userToCreate.getEmail())){
            throw new IllegalArgumentException("This account Email already exists. ");
        }
        return repository.save(userToCreate);
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
