package com.finalproj.schoolmanagementsystem.repository;

import com.finalproj.schoolmanagementsystem.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
