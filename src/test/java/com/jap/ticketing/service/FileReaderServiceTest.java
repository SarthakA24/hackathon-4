package com.jap.ticketing.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReaderServiceTest {
    FileReaderService fileReaderService;

    @BeforeEach
    void setUp() {
        fileReaderService = new FileReaderService();
        String fileName = "src/test/resources/sample.csv";
    }

    @AfterEach
    void tearDown() {
        fileReaderService = null;
    }

    @Test
    void readFile() {
    }
}