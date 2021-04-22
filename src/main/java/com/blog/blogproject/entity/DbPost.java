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

    @Nullable
    @Column(name = "hash_tag")
    private String hashTag;

    @ManyToOne(fetch = FetchType.EAGER)
    private DbUser dbUser;




}
