package com.github.tecuilacat.commons.api;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    @Test
    void generateErrorReport() {
        Generator.generateErrorReport(new TaskStarter("", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
    }
}