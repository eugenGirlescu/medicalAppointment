package com.app.medicalAppointment.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Doctor")
@Table(name = "doctor")
@Data
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    @ManyToOne
    @JoinColumn(name = "speciality_id")
    private  Speciality specialty;
}
