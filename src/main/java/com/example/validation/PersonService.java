package com.example.validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    // Placeholder method to save a person
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }
    public Person getPersonByEmployeeId(String employeeId) {
        Person someOne = new Person();
        someOne.getEmployeeId();
        return someOne;
    }
}
