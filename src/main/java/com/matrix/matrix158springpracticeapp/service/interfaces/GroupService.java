package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.entity.Group;
import com.matrix.matrix158springpracticeapp.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    Optional<Group> findById(Integer id);
    List<Group> findAll();
    Group save(Group group);
    void deleteById(Integer id);
}
