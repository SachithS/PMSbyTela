package com.tela.pms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tela.pms.service.IndividualPatientService;


/**
 * @author Tela DevCenter
 *
 */
@Controller
public class IndividualPatientController {


	@Autowired
	public IndividualPatientService patientService; 
	
	private static final Logger logger = LoggerFactory.getLogger(IndividualPatientController.class);
	
	@RequestMapping(value = "/findIndividual", method = RequestMethod.GET)
	public String retreveIndividual(Model model) {
		
		logger.info("Invoking retreveIndividual method in IndividualPatientController");
		
		patientService.findPatient();
	
		
		/*model.addAttribute("serverTime", formattedDate );*/
		
		return "patient";
	}
}
