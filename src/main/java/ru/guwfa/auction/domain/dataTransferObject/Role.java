package ru.guwfa.auction.domain.dataTransferObject;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    User, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}