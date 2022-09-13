package com.jap.ticketing.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileReaderServiceTest {
    FileReaderService fileReaderService;
    private final String FILENAME = "src/test/resources/sample.csv";

    @BeforeEach
    void setUp() {
        fileReaderService = new FileReaderService();
    }

    @AfterEach
    void tearDown() {
        fileReaderService = null;
    }

    @Test
    void readFile() {
    }
}