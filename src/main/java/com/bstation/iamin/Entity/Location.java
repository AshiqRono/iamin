package com.bstation.iamin.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Location extends BaseEntity{
    public String locationName;
}
