package co.com.cazcode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.com.cazcode.model.Person;

@Service
public interface IPersonaService {
	public List<Person> getAll();
	public Optional<Person> getPerson(int id);
	public int save(Person p);
	public void delete(int id);
}
