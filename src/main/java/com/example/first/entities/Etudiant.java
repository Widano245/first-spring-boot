package com.example.first.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Getter @Setter
public class Etudiant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idet;
    private  String nom;
    private  Integer age;
    private  Double note;
}
