package com.codyortiz.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/m")
public class DojoController {

		@RequestMapping("/{dojo}")
		public String theDojo(@PathVariable("dojo") String dojo) {
			if (dojo.equals("dojo")) {
				return "The dojo is awesome!";
			}
			else if (dojo.equals("burbank-dojo")) {
				return "Burbank Dojo is in Southern California";
			}
			
			else if (dojo.equals("san-jose")) {
				return "SJ dojo is the headquarters";
			}
			else 
				return "No correct parameters input!";
		}
		
}
