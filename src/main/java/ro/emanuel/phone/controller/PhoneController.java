package ro.emanuel.phone.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.phone.dao.PhoneDAO;
import ro.emanuel.phone.pojo.Phone;

@Controller
public class PhoneController {

	@GetMapping("/phone") 
	public String singlePhone(@RequestParam int id, Model model) throws SQLException, ClassNotFoundException {
		// iau telefonul din id-ul x(param)din baza de date
		//Cum?
		//iau obiectul din db
		Phone c = PhoneDAO.getById(id);
		
		//adaugam in pagina jsp
		model.addAttribute("s",c);
		return "phone.jsp";
	}
	@GetMapping("/phones")
	public String allPhones(Model model) throws ClassNotFoundException, SQLException {
		// aduc toate telefoanele din db
		
		ArrayList<Phone> allPhones = PhoneDAO.getAll();
		
		//adaug telefoanele in pagina
		
		model.addAttribute("all",allPhones);
		
		return "phones.jsp";
	}
}
