package com.example.snapwork.StudentApp.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class FileProcessingService {

	 @Async
	 public CompletableFuture<List<String>> processFile(String filePath) throws IOException {
	        List<String> ids = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                ids.add(line.trim()); // Assuming each line in the CSV is an ID
	            }
	        } catch (IOException e) {
	            throw new IOException("Error processing file: " + e.getMessage());
	        }
System.out.println("IDS :: "+ids);
	        return CompletableFuture.completedFuture(ids);
	    }
}
