package com.datahandling.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoJsonFiles {

	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		ObjectNode json1 = (ObjectNode) mapper.readTree(new File("D:\\File Handling\\JSON\\file1.json"));
		ObjectNode json2 = (ObjectNode) mapper.readTree(new File("D:\\File Handling\\JSON\\file2.json"));

		json1.setAll(json2);

		System.out.println(json1.toPrettyString());
	}
}
