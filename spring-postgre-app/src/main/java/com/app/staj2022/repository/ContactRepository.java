package com.app.staj2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.staj2022.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
