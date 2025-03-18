package com.leads.SelesSweets.models.projection;

import com.leads.SelesSweets.models.User;

public interface UserProjection {
    User create(User userToCreate);
    User findById(Long id);
}
