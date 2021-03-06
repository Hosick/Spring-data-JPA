package net.skhu.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String userId;

    String password;

    String name;

    String email;

    boolean enabled;

    String userType;

    @ManyToOne
    @JoinColumn(name = "departmentId")
    Department department;
}
