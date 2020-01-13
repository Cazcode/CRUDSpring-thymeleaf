package co.com.cazcode.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.cazcode.ImpService.ImpPersonaService;
import co.com.cazcode.model.Person;

@Controller
@RequestMapping
public class PersonController {
	
	@RequestMapping("/list")
	public String getAll(Model model) {
		model.addAttribute("personas", service.getAll());
		return "index";
	}
	
	@RequestMapping("/new")
	public String addPerson(Model model) {
		model.addAttribute("person", new Person());
		return "formNew";
	}
	
	@RequestMapping("/save")
	public String savePerson(@Valid Person p, Model model) {
		service.save(p);
		return "redirect:/list";
	}
	

	@RequestMapping("/update/{id}")
	public String editPerson(@PathVariable int id, Model model) {
		Optional<Person> p = service.getPerson(id);
		model.addAttribute("person", p);
		return "formNew";
	}
	
	@RequestMapping("/delete/{id}")
	public String deletePerson(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/list";
	}
	
	@Autowired
	private ImpPersonaService service;
}
