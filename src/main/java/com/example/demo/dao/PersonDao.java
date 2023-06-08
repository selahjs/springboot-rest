package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
//    insert person with id
    int insertPerson(UUID id, Person person);
//insert person without id, ie generated
    default int insertPerson(Person person)
    {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);

}
