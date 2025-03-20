package com.leads.SelesSweets.models.projection;

import com.leads.SelesSweets.models.Users;

public interface UserProjection {
    Users create(Users userToCreate);
    Users findById(Long id);
}
