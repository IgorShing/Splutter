package com.material.examples.json;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.material.logic.Demo;

public class ExampleJson implements Demo {

	@Override
	public String getName() {
		return "JSON example";
	}

	@Override
	public void run() {

		//writeToJson();

		readFromJson();

	}


	void readFromJson()
	{
		User user = new User();
		GovernmentAgency agency = new GovernmentAgency();

		ObjectMapper mapper = new ObjectMapper();
		try {
			// mapper.writeValue(new File("..\\material\\examples\\json\\data\\user.json"), user);
			//	user = mapper.readValue(new File("user1.json"), User.class);
			//	agency = mapper.readValue(new File("govAgency1.json"), GovernmentAgency.class);

			// display to console
			// System.out.println(mapper.writeValueAsString(user));
			// System.out.println(mapper.writeValueAsString(agency));

			String strJson = "{\"name\":\"Agency\",\"searchTerms\":[\"law\",\"law\",\"law\",\"justice\",\"judge\",\"decision\"]}";
			agency = mapper.readValue(strJson, GovernmentAgency.class);

			System.out.println(agency);

		} catch (JsonGenerationException e) {

			e.printStackTrace();

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	void writeToJson()
	{
		User user = new User();
		GovernmentAgency agency = new GovernmentAgency();

		Set<String> searchTerms = new HashSet<String>();

		searchTerms.add("law");
		searchTerms.add("justice");
		searchTerms.add("judge");
		searchTerms.add("decision");

		agency.setSearchTerms(searchTerms);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// mapper.writeValue(new File("..\\material\\examples\\json\\data\\user.json"), user);
			//	mapper.writeValue(new File("user1.json"), user);
			//mapper.writeValue(new File("govAgency1.json"), agency);

			// display to console
			//	String strForUser = mapper.toString();
			//	System.out.println(strForUser);

			// System.out.println(mapper.writeValueAsString(user));


			System.out.println(mapper.writeValueAsString(agency));

		} catch (JsonGenerationException e) {

			e.printStackTrace();

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
