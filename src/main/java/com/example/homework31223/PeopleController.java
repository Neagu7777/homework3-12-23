package com.example.homework31223;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

import static org.apache.catalina.security.SecurityUtil.remove;

@RestController
@RequestMapping
public class PeopleController {
    private List<People> peopleList = new ArrayList<>();
    @Autowired
    private PeopleService peopleService;

    // API для получения списка всех возможных людей
    @GetMapping(value = "/list/people")
    public List<People> getPeople() {
        return peopleService.getAllPeople();

    }
    @GetMapping(value = "/short-name")
    public String getShortestNameRecommendation() {
        return peopleService.getShortestNameRecommendation();

    }
    @GetMapping(value = "/name/show")
    public List<String> getAllNames() {
        List<People> allPeople = peopleService.getAllPeople();
        return allPeople.stream().map(People::getName).toList();
    }

    @GetMapping("/name/{number}")
    public String getName(@PathVariable(value = "number") Integer number) {
        return "Name not implemented";
    }

    @DeleteMapping("/name/{number}")
    public void deleteName(@PathVariable(value = "number") Integer number) {
        // Implement deletion logic
    }

    @PutMapping("/name/{number}")
    public void updateName(@PathVariable(value = "number") Integer number, @RequestBody People updatedPerson) {
        // Implement update logic
    }

    @PostMapping("/name/add")
    public void addNewName(@RequestBody People newPerson) {
        // Implement add logic
    }
}

