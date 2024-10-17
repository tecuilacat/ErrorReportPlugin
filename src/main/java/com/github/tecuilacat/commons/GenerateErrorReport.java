package com.github.tecuilacat.commons;

import com.github.tecuilacat.commons.api.Generator;
import com.github.tecuilacat.commons.api.TaskStarter;
import lombok.Setter;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.util.List;

@Setter
public class GenerateErrorReport extends DefaultTask {

    private String serverUrl;
    private List<String> members;
    private List<String> modules;
    private List<String> logDirectories;

    @Input
    public String getServerUrl() {
        return serverUrl;
    }

    @Input
    public List<String> getMembers() {
        return members;
    }

    @Input
    public List<String> getModules() {
        return modules;
    }

    @Input
    public List<String> getLogDirectories() {
        return logDirectories;
    }

    @TaskAction
    public void generateReport() {
        getLogger().lifecycle("Generating error report from input: " + serverUrl);
        getLogger().lifecycle("Generating error report from input: " + members);
        getLogger().lifecycle("Generating error report from input: " + modules);
        getLogger().lifecycle("Generating error report from input: " + logDirectories);
        Generator.generateErrorReport(new TaskStarter(serverUrl, members, modules, logDirectories));
    }

}