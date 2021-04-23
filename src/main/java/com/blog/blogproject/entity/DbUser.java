package com.blog.blogproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class DbUser extends BaseEntity{

    private Long id;

    @Column(name = "user_name", unique = true)
    private String userName;

    @Column(unique = true)
    private String email;

    @Column(name = "profile_picture_path")
    private String profilePicturePath;

    private String password;

    public DbUser(String userName, String email, String password) {
        super();
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public DbUser() {
        super();
    }
}
