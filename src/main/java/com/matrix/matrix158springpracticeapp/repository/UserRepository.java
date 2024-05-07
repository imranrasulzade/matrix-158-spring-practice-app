package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

