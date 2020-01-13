package co.com.cazcode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.cazcode.model.Person;

@Repository
public interface IPersona extends CrudRepository<Person, Integer>{

}
