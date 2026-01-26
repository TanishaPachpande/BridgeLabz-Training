package com.datahandling.json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConverter {

	public static void main(String[] args) throws Exception {

		ObjectMapper jsonMapper = new ObjectMapper();
		XmlMapper xmlMapper = new XmlMapper();

		JsonNode jsonNode = jsonMapper.readTree(new File("D:\\File Handling\\JSON\\file1.json"));

		String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

		System.out.println(xml);
	}
}
