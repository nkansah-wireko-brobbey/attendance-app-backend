package com.example.demo.domain;

import com.example.demo.constants.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member_user")
public class User extends Audit{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String rfidUid;

    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}
