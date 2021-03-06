package com.ttcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ttcs.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
