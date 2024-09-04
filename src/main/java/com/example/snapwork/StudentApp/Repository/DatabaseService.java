package com.example.snapwork.StudentApp.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.snapwork.StudentApp.Bean.FileDTO;

@Service
public class DatabaseService {
	@Autowired
	FileRepository fileRepository;
	
	 public void updateDatabase(List<String> ids) {
	        // Example logic to update database with provided IDs
	        for (String id : ids) {
	        	 System.out.println("Ids In Repos :: " + id);	    
	        	fileRepository.save(FileDTO.builder().TransactionId(id).build());
	            System.out.println("Updating database with ID: " + id);	          
	        }
	    }
}
