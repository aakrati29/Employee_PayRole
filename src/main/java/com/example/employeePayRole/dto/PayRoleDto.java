package com.example.employeePayRole.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayRoleDto {

    @NotBlank(message = "Gender cannot be blank")
    @Pattern(regexp = "^(Male|Female|Other)$", message = "Gender must be Male, Female, or Other")
    private String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @PastOrPresent(message = "Start date must be in the past or present")
    private LocalDate startDate;

    @NotBlank(message = "Note cannot be blank")
    private String note;

    @NotBlank(message = "Profile picture URL cannot be blank")
    private String profilePic;

    @NotBlank(message = "Department cannot be blank")
    private String department;
}
