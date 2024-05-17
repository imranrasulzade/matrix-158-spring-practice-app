package com.matrix.matrix158springpracticeapp.service.interfaces;

import com.matrix.matrix158springpracticeapp.entity.Group;
import com.matrix.matrix158springpracticeapp.entity.SocialMedia;
import com.matrix.matrix158springpracticeapp.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface SocialMediaService {
    Optional<SocialMedia> findById(Integer id);
    List<SocialMedia> findAll();
    SocialMedia save(SocialMedia socialMedia);
    void deleteById(Integer id);
}
