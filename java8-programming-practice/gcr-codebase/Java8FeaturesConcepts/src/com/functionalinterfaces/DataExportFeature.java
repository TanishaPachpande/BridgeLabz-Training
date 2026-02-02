package com.functionalinterfaces;

@FunctionalInterface
interface ExportUtil{
	
	void export();
	
	default void exportToJSON() {
		System.out.println("Converted into JSON");
	}
}

public class DataExportFeature {
	public static void main(String[] args) {
		ExportUtil csv = () -> System.out.println("Converted into CSV");
		ExportUtil pdf = () -> System.out.println("Converted into PDF");
		
		csv.export();
		pdf.export();
		csv.exportToJSON();
		pdf.exportToJSON();
		
	}
}
