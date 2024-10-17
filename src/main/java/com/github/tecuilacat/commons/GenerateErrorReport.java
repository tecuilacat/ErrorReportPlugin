package com.github.tecuilacat.commons;

import com.github.tecuilacat.commons.api.Generator;
import lombok.Setter;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.util.List;

@Setter
public class GenerateErrorReport extends DefaultTask {

    private String input;
    private List<String> modules;

    @Input
    public String getInput() {
        return input;
    }

    @Input
    public List<String> getModules() {
        return modules;
    }

    @TaskAction
    public void generateReport() {
        getLogger().lifecycle("Generating error report from input: " + input);
        getLogger().lifecycle("Using modules: " + modules);
        Generator.generateErrorReport(new File(getProject().getBuildDir(), "error-report.html"));
    }

}