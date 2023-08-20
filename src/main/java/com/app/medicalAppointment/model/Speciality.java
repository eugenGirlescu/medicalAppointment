package com.app.medicalAppointment.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "Speciality")
@Table(name = "speciality")
@Data
@NoArgsConstructor
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "speciality")
    private Set<Doctor> doctors;
}
