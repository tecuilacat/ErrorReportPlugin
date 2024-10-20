package com.github.tecuilacat.commons;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class ErrorReportPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("generateErrorReport", GenerateErrorReport.class, task -> {
            task.setGroup("Reporting");
            task.setDescription("Generates an HTML error report.");
        });
    }

}
