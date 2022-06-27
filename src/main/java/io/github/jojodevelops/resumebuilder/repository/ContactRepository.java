package io.github.jojodevelops.resumebuilder.repository;

import io.github.jojodevelops.resumebuilder.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}