package com.blog.blogproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
public class Role {

    private String name;

    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Role(Long id, String name, String description) {

        this.name = name;
        this.description = description;
    }
    @OneToMany(fetch = FetchType.EAGER)
    private List<DbUser> users;

    public Role() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
