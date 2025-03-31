package com.leads.SelesSweets.models.DTO;

import com.leads.SelesSweets.models.UserRole;

public record RegisterDTO(String username, String password, UserRole role) {
}
