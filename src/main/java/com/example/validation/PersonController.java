package com.example.validation;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;

    }
    @PostMapping("/createPerson")
    public ResponseEntity<String> addPerson(@RequestBody @Valid Person person) {

        personService.savePerson(person);
        return new ResponseEntity<>("Person created successfully", HttpStatus.OK);

    }
    @GetMapping("/person/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable String employeeId) {
        if(employeeId.length() > 5 || employeeId.isBlank()) {
            return ResponseEntity.badRequest().body("EmployeeId is invalid");

        }

        Person person = personService.getPersonByEmployeeId(employeeId);
        if(person == null) {
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(person);

    }

}