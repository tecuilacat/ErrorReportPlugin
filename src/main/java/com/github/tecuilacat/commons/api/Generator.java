package com.github.tecuilacat.commons.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {

    public static void generateErrorReport(File reportFile) {
        try {
            if (!reportFile.exists()) {
                reportFile.createNewFile();
            }
            FileWriter writer = new FileWriter(reportFile);
            writer.write("<html><body><h1>Error Report</h1><p>No errors found!</p></body></html>");
            writer.close();
            System.out.println("Generated error report: " + reportFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("HAT NICHT GEKLAPPT");
            throw new RuntimeException("Error generating report", e);
        }
    }

}
