package com.app.medicalAppointment.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Appointment")
@Data
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany(mappedBy = "user")
    private List<Appointment> appointments;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "appointment_datetime")
    private LocalDateTime appointmentDateTime;

}
