package com.pm.patientservice.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.*;


@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientResponseDTO {
    @JsonProperty("patient_id")
    private Integer id;

    @JsonProperty("full_name")
    private String name;

    @JsonProperty("email_address")
    private String email;

    @JsonProperty("home_address")
    private String address;

    @JsonProperty("date_of_birth")
    private String birthDate;
}
