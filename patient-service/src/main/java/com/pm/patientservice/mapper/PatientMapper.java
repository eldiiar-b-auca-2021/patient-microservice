package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        return PatientResponseDTO.builder()
                .id(patient.getId())
                .name(patient.getName())
                .email(patient.getEmail())
                .address(patient.getAddress())
                .birthDate(patient.getBirthDate().toString())
                .build();
    }

    public static Patient toEntity(PatientRequestDTO patientRequestDTO) {
        return Patient.builder()
                .address(patientRequestDTO.getAddress())
                .email(patientRequestDTO.getEmail())
                .name(patientRequestDTO.getName())
                .birthDate(LocalDate.parse(patientRequestDTO.getDateOfBirth()))
                .build();
    }
}
