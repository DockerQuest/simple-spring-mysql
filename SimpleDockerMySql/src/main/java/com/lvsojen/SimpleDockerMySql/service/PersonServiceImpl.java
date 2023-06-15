package com.lvsojen.SimpleDockerMySql.service;

import com.lvsojen.SimpleDockerMySql.entity.Person;
import com.lvsojen.SimpleDockerMySql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(int id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()) {
            throw new RuntimeException();
        }
        return optionalPerson.get();
    }

    @Transactional
    @Override
    public Person update(int id, Person person) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()) {
            throw new RuntimeException();
        }

        Person personToUpdate = optionalPerson.get();
        if(person.getFirstName() != null) {
            personToUpdate.setFirstName(person.getFirstName());
        }
        if(person.getLastName() != null) {
            personToUpdate.setLastName(person.getLastName());
        }
        if(person.getGender() != null) {
            personToUpdate.setGender(person.getGender());
        }
        if(person.getHobby() != null) {
            personToUpdate.setHobby(person.getHobby());
        }
        if(person.getAge() > 0) {
            personToUpdate.setAge(person.getAge());
        }
        return personRepository.save(personToUpdate);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isEmpty()) {
            throw new RuntimeException();
        }
        personRepository.deleteById(id);
    }

}
