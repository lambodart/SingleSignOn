package com.example.snapwork.StudentApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.snapwork.StudentApp.Bean.FileDTO;

public interface FileRepository extends JpaRepository<FileDTO, String>{

	
}
