package com.blog.blogproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
public class Role extends BaseEntity{

    private String name;

    private String description;


    public Role(Long id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }
    @OneToMany(fetch = FetchType.EAGER)
    private List<DbUser> users;
}
