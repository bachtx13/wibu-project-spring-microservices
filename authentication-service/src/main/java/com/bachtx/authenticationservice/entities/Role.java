package com.bachtx.authenticationservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Table("role")
public class Role {
    @Id
    private UUID id;
    private String name;
}
