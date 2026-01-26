package com.datahandling.json;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJsonConverter {

	public static void main(String[] args) throws Exception {

		CsvMapper csvMapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		List<Object> csvData = csvMapper.readerFor(Map.class).with(schema).readValues(new File("D:\\File Handling\\CSV_Files\\students.csv"))
				.readAll();

		ObjectMapper jsonMapper = new ObjectMapper();
		String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(csvData);

		System.out.println(json);
	}
}
