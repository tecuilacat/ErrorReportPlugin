package com.github.tecuilacat.commons;

import com.github.tecuilacat.commons.api.Generator;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.util.List;

public class GenerateErrorReport extends DefaultTask {

    private String input;
    private List<String> modules;

    @Input
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Input
    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    @TaskAction
    public void generateReport() {
        getLogger().lifecycle("Generating error report from input: " + input);
        getLogger().lifecycle("Using modules: " + modules);
        Generator.generateErrorReport(new File(getProject().getBuildDir(), "error-report.html"));
    }

}