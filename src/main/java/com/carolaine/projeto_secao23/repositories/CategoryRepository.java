package com.carolaine.projeto_secao23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolaine.projeto_secao23.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}