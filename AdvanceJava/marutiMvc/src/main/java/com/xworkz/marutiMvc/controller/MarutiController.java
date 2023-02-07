package com.xworkz.marutiMvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.marutiMvc.dto.BeverageDTO;
import com.xworkz.marutiMvc.dto.ChatDTO;
import com.xworkz.marutiMvc.dto.EducationDTO;
import com.xworkz.marutiMvc.dto.FamilyDTO;
import com.xworkz.marutiMvc.dto.MobileDTO;

@Component
@RequestMapping("/")
public class MarutiController {
	
	public MarutiController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("runnning onEmail..");
		model.addAttribute("mailId", "maruti.xworkz@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/number")
	public String onMobile(Model model) {
		System.out.println("running onMobile..");
		model.addAttribute("number", 8105501328L);
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("running onAdhar..");
		model.addAttribute("adharNo", 2077685245556L);
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge");
		model.addAttribute("age", 23);
		return "index.jsp";
	}
	
	@GetMapping("/dob")
	public String onDate(Model model) {
		System.out.println("running onDate....");
		model.addAttribute("dateAndTime", LocalDateTime.of(2000, 10, 31, 12, 30));
		return "index.jsp";
	}
	
	@GetMapping("/amount")
	public String onSalary(Model model) {
		System.out.println("running onSalary..");
		model.addAttribute("salary", 30000);
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String friendsName(Model model) {
		System.out.println("running friendsName..");
		List<String> list = new ArrayList();
		list.add("Deepak");
		list.add("Vinayak");
		list.add("Raju");
		list.add("Vivek");
		model.addAttribute("friend", list);
		return "index.jsp";
	}
	
	@GetMapping("/places")
	public String visitedPlaces(Model model) {
		System.out.println("running visitedPlaces...");
		List<String> list1 = new ArrayList();
		list1.add("Manglore");
		list1.add("Kundapur");
		list1.add("Shrungeri");
		list1.add("Murudeshwar");
		list1.add("Mysore");
		model.addAttribute("place", list1);
		return "index.jsp";
	}
	
	@GetMapping("/skills")
	public String skillSets(Model model) {
		System.out.println("running skillSets..");
		List<String> list = new ArrayList();
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		list.add("BootStrap");
		list.add("JavaScript");
		list.add("MYSQl");
		model.addAttribute("skill", list);
		return "index.jsp";
	}
	
	@GetMapping("/edu")
	public String education(Model model) {
		EducationDTO dto = new EducationDTO();
		dto.setName("Maruti");
		dto.setLocation("Mudhol");
		dto.setCollageName("BGMIT");
		dto.setQualification("B.E");
		dto.setSemesters(8);
		dto.setPercentage(70.0);
		dto.setTotalMarks(800);
		dto.setType("UG");
		dto.setAddress("Paloji");
		model.addAttribute("education", dto);
		return "index.jsp";
	}
	
	@GetMapping("/fam")
	public String familyDetails(Model model) {
		FamilyDTO dto = new FamilyDTO() ;
		dto.setFatherName("Mohan");
		dto.setMotherName("Vaishali");
		dto.setElderSisterName("Vidya");
		dto.setSisterName("Laxmi");
		dto.setSirName("Paloji");
		dto.setCousinName("Mamata");
		dto.setBrotherName("Sagar");
		dto.setNoOfMembers(5);
		dto.setFathersWork("DailyWages");
		dto.setMyName("Maruti");
		model.addAttribute("family", dto);
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String mobileDetails(Model model) {
		System.out.println("running mobileDetails.");
		MobileDTO dto = new MobileDTO();
		dto.setBrand("MI");
		dto.setColor("Black");
		dto.setPrice(8000.00);
		dto.setVersion(6);
		dto.setStorage("32 GB");
		model.addAttribute("mob", dto);
		return "index.jsp";
	}
	
	@GetMapping("/beverage")
	public String beverageDetails(Model model) {
		System.out.println("running beverageDetails..");
		BeverageDTO dto = new BeverageDTO();
		dto.setName("Cofee");
		dto.setColor("Brown");
		dto.setBrand("Bru");
		dto.setFlavour("milk");
		dto.setPrice(30.00);
		dto.setBuyer("Maruti");
		dto.setQuantity("1 cup");
		dto.setShopName("Namm coffee");
		dto.setTypes(4);
		dto.setSugarContent("Less");
		model.addAttribute("coffee", dto);
		return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String chatDetails(Model model) {
		System.out.println("running chatDetails");
		ChatDTO dto = new ChatDTO();
		dto.setId(1);
		dto.setName("Gobi Manchuri");
		dto.setPrice(60.00);
		dto.setMadeBy("Vinayak");
		dto.setLocation("Rajajinagar");
		dto.setQuantity("1 plate");
		dto.setCoolDrinkName("Sprite");
		dto.setBuyerName("Annesh");
		dto.setTaste(false);
		dto.setCenterName("unlimited Chat center");
		dto.setType("Spicy");
		model.addAttribute("chat", dto);
		return "index.jsp";
	}

}
