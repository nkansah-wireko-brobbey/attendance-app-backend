package com.example.demo.domain;

import com.example.demo.constants.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class User extends Audit{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String rfidUid;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}
