package com.raysmond.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tags")
@Getter @Setter
public class Tag extends BaseModel {

    public Tag(){}
    public Tag(String name){ this.setName(name); }

    @Column(length = 64, nullable = false, unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
    private List<Post> posts = new ArrayList<>();
}
