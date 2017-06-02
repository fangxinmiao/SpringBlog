package com.raysmond.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Raysmond
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseModel {
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";

    public User() {
    }

    public User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    @Column(length = 64, unique = true)
    private String email;

    @JsonIgnore
    @Column(length = 128, unique = true)
    private String password;

    @Column(length = 16)
    private String role = ROLE_USER;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.REMOVE)
    private Collection<Post> posts = new ArrayList<>();
}
