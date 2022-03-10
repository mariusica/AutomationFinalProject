package core.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader {

	
	public static JSONObject json(String name) {
		String jsonPath = System.getProperty("user.dir") + "\\src\\testDataFiles\\" + name + ".json";
	
	
	FileReader reader = null;
	try {
		reader = new FileReader(jsonPath);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	JSONParser jsonParser = new JSONParser();
	JSONObject obj = null;
	try {
		obj = (JSONObject) jsonParser.parse(reader);
	} catch (ParseException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	return obj;
}
}