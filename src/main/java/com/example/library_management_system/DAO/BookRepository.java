package com.example.library_management_system.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_management_system.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
