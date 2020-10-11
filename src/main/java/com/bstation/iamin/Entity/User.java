package com.bstation.iamin.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class User extends BaseEntity{

    private String userName;

    private String password;

    @OneToMany
    List<Post> posts;

    @ManyToOne
    private Role role;
}
