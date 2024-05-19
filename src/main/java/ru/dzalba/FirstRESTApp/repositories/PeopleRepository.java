package ru.dzalba.FirstRESTApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dzalba.FirstRESTApp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
}