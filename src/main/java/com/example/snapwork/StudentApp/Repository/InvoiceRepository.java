package com.example.snapwork.StudentApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.snapwork.StudentApp.Bean.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
 