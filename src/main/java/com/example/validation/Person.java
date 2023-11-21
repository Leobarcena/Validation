package com.example.validation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;
    @NotBlank(message = "Title cannot be blank")
    private String title;
    @NotBlank(message = "Employee ID cannot be blank")
    @Size(max = 5, message = "ID cannot be greater than 5 characters")
    private String employeeId;
    @NotBlank(message = "Position cannot be blank")
    private String position;
    @NotBlank(message = "Department cannot be blank")
    private String department;
}

