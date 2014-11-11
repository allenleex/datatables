package de.nexum.datatables.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import de.nexum.datatables.datatables.DataTablesRequest;
import de.nexum.datatables.datatables.DataTablesResponse;

/**
 * @author <a href="mailto:thomas.weckert@nexum.de">Thomas Weckert</a>
 */
@Controller
@RequestMapping(value="/api")
public class DataTablesController {
	
	private static final String[][] DATA = {
	      {
	          "Airi",
	          "Satou",
	          "Accountant",
	          "Tokyo",
	          "28th Nov 08",
	          "$162,700"
	       },
	       {
	          "Angelica",
	          "Ramos",
	          "Chief Executive Officer (CEO)",
	          "London",
	          "9th Oct 09",
	          "$1,200,000"
	       },
	       {
	          "Ashton",
	          "Cox",
	          "Junior Technical Author",
	          "San Francisco",
	          "12th Jan 09",
	          "$86,000"
	       },
	       {
	          "Bradley",
	          "Greer",
	          "Software Engineer",
	          "London",
	          "13th Oct 12",
	          "$132,000"
	       },
	       {
	          "Brenden",
	          "Wagner",
	          "Software Engineer",
	          "San Francisco",
	          "7th Jun 11",
	          "$206,850"
	       },
	       {
	          "Brielle",
	          "Williamson",
	          "Integration Specialist",
	          "New York",
	          "2nd Dec 12",
	          "$372,000"
	       },
	       {
	          "Bruno",
	          "Nash",
	          "Software Engineer",
	          "London",
	          "3rd May 11",
	          "$163,500"
	       },
	       {
	          "Caesar",
	          "Vance",
	          "Pre-Sales Support",
	          "New York",
	          "12th Dec 11",
	          "$106,450"
	       },
	       {
	          "Cara",
	          "Stevens",
	          "Sales Assistant",
	          "New York",
	          "6th Dec 11",
	          "$145,600"
	       },
	       {
	          "Cedric",
	          "Kelly",
	          "Senior Javascript Developer",
	          "Edinburgh",
	          "29th Mar 12",
	          "$433,060"
	       }
	 };	

	@ResponseBody
	@RequestMapping(value="/data", method= RequestMethod.POST)
    public DataTablesResponse<List<String>> getData(@RequestBody DataTablesRequest dataTablesRequest) {
		
		DataTablesResponse<List<String>> dataTablesResponse = new DataTablesResponse<List<String>>();		
		dataTablesResponse.setTotalDisplayRecords(10);
		dataTablesResponse.setTotalRecords(57);
		
		List<List<String>> data = new ArrayList<List<String>>();		
		for (String[] nextArray : DATA) {			
			data.add(Arrays.asList(nextArray));
		}
 
		dataTablesResponse.setData(data);
		
        return dataTablesResponse;
    }
	
}
