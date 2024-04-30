package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface UserRepository extends JpaRepository<User,Long> {
=======
public interface UserRepository extends JpaRepository<User, Integer> {
>>>>>>> 7daf9680c7dc11b00cdc5f3e6c5e575cc0788365
}
