package com.github.tecuilacat.commons.api;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class GeneratorTest {

    @Test
    void generateErrorReport() {
        Generator.generateErrorReport(new File("./build/error-report.html"));
    }
}