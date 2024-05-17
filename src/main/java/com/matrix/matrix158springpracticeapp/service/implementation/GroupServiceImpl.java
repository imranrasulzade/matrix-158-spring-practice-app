package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.entity.Group;
import com.matrix.matrix158springpracticeapp.entity.Teacher;
import com.matrix.matrix158springpracticeapp.repository.GroupRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    @Override
    public Optional<Group> findById(Integer id) {
        return groupRepository.findById(id);
    }

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group save(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public void deleteById(Integer id) {
        groupRepository.deleteById(id);
    }
}
