package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    public PeopleRepository peopleRepository;
    public void save(String name, int age) {
        System.out.println("PeopleService.save");
        System.out.println("name = " + name + ", age = " + age);
        peopleRepository.save(name,age);
    }

    public void save1(PeopleDTO peopleDTO) {
        peopleRepository.save1(peopleDTO);
    }
}