package com.junitPractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileProcessorTest {

	FileProcessor fileProcessor;
    Path testFile;

    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
        testFile = Path.of("testFile.txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        if (Files.exists(testFile)) {
            Files.delete(testFile);
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit";

        fileProcessor.writeToFile(testFile.toString(), content);
        String result = fileProcessor.readFromFile(testFile.toString());

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFile.toString(), "Test Content");

        assertTrue(Files.exists(testFile));
    }

    @Test
    void testReadFileThatDoesNotExist() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("noSuchFile.txt");
        });
    }

}
