package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
	private CarServiceImpl carService;

	@Autowired
	public CarsController (CarServiceImpl carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
		model.addAttribute("cars",carService.getCars(count));
		return "cars";
	}
	
}