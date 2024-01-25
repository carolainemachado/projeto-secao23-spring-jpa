package com.carolaine.projeto_secao23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carolaine.projeto_secao23.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}