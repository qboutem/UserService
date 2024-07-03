package com.hromenko.userserviceroman.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String location;

    @Column(name="birth_date")
    private Timestamp birthDate;

    @Column
    @Enumerated(value=EnumType.STRING)
    private Status status=Status.ACTIVE;

    @Column(name = "preferred_language")
    private String preferredLanguage;

}
