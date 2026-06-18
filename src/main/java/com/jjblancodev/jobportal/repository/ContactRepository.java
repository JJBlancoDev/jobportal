package com.jjblancodev.jobportal.repository;

import com.jjblancodev.jobportal.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}