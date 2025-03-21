package com.leads.SelesSweets.models.projection;

import com.leads.SelesSweets.models.UserRole;

public record RegisterDTO(String username, String password, UserRole role) {
}
