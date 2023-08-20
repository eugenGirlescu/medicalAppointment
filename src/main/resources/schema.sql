
CREATE DATABASE IF NOT EXISTS medicalAppointment;
use medicalAppointment;

-- specialties TABLE --

CREATE TABLE speciality (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            name VARCHAR(100)
);

-- DOCTORS TABLE --

CREATE TABLE doctor (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        speciality_id INT,
                        FOREIGN KEY (speciality_id) REFERENCES speciality(id)
);

-- USER TABLE --

CREATE TABLE user (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      first_name VARCHAR(100),
                      last_name VARCHAR(100),
                      email VARCHAR(100),
                      phone VARCHAR(20)
);

-- APPOINTMENT TABLE --

CREATE TABLE appointment (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             doctor_id INT,
                             user_id INT,
                             appointment_datetime DATETIME,
                             FOREIGN KEY (doctor_id) REFERENCES doctor(id),
                             FOREIGN KEY (user_id) REFERENCES user(id)
);
