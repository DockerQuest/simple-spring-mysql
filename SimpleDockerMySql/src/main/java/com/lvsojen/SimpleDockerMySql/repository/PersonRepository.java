package com.lvsojen.SimpleDockerMySql.repository;

import com.lvsojen.SimpleDockerMySql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    // that's it ... no need to write any code LOL!
}
