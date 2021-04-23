package com.blog.blogproject.entity;


import lombok.Data;
import org.springframework.lang.Nullable;

import javax.lang.model.type.NullType;
import javax.persistence.*;

@Entity
@Table(name = "posts")
@Data
public class DbPost extends BaseEntity {

    private String header;
    private String content;


    @ManyToOne(fetch = FetchType.EAGER)
    private DbUser dbUser;

    public DbPost(String header, String content) {
        this.header = header;
        this.content = content;
    }

    public DbPost() {
        super();
    }
}
