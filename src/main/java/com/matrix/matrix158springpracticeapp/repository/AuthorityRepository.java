package com.matrix.matrix158springpracticeapp.repository;

import com.matrix.matrix158springpracticeapp.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long> {

}
