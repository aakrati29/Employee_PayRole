package com.example.employeePayRole.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayRoleDto {
    private Integer id;
    private String name;
    private String phoneNumber;
    private Long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private String department;
}
