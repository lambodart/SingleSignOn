package com.example.snapwork.StudentApp.Controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.snapwork.StudentApp.Repository.DatabaseService;
import com.example.snapwork.StudentApp.Service.FileProcessingService;

@RestController
public class FileUploadController {

	@Autowired
    private FileProcessingService fileProcessingService;  

    @Autowired
    private DatabaseService databaseService;
    
	@GetMapping("/getFileUpload")
	public String handleFileUpload() {  
	        try {
	        	
	        	String filePath = "C:\\\\Users\\\\LambodarThakur\\\\Downloads\\\\ids.csv";
	        	System.out.println(filePath);
	            // Trigger file processing asynchronously
	            CompletableFuture<List<String>> idsFuture = fileProcessingService.processFile(filePath);

	            // Wait for file processing to complete and get the IDs
	            List<String> ids = idsFuture.get();
	            System.out.println("Get Ids From File :: "+ids);
	            // Update the database with the IDs
	            databaseService.updateDatabase(ids);

	            return "File processed and database updated successfully!";
	        } catch (IOException e) {
	            return "Failed to process file: " + e.getMessage();
	        } catch (Exception e) {
	            return "Failed to update database: " + e.getMessage();
	        }
	    }
	
}
