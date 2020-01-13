package co.com.cazcode.ImpService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.cazcode.model.Person;
import co.com.cazcode.repository.IPersona;
import co.com.cazcode.service.IPersonaService;
@Service
public class ImpPersonaService implements IPersonaService {

	@Override
	public List<Person> getAll() {
		return (List<Person>) data.findAll();
	}

	@Override
	public Optional<Person> getPerson(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Person p) {
		if(data.save(p) != null) 
			return 1;
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
	@Autowired
	private IPersona data;
}
