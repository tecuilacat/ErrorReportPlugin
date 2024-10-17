package com.github.tecuilacat.commons;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateErrorReport extends DefaultTask {

    @TaskAction
    public void generateReport() {
        File reportFile = new File(getProject().getBuildDir(), "error-report.html");
        try (FileWriter writer = new FileWriter(reportFile)) {
            writer.write("<html><body><h1>Error Report</h1><p>No errors found!</p></body></html>");
            System.out.println("Generated error report: " + reportFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("HAT NICHT GEKLAPPT");
            throw new RuntimeException("Error generating report", e);
        }
    }

}