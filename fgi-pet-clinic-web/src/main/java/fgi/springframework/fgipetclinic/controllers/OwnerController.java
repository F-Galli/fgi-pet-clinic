package fgi.springframework.fgipetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fgi.springframework.fgipetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners(Model model) {

		model.addAttribute("owners", ownerService.findAll());

		return "owners/index";
	}
}
