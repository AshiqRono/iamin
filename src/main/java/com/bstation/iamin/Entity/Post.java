package com.bstation.iamin.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Post extends BaseEntity{
    public String postedBy;

    public String location;

    public boolean forPublic;
}
