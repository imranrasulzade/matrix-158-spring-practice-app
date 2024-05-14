package com.matrix.matrix158springpracticeapp.service.implementation;

import com.matrix.matrix158springpracticeapp.entity.SocialMedia;
import com.matrix.matrix158springpracticeapp.entity.Teacher;
import com.matrix.matrix158springpracticeapp.repository.SocialMediaRepository;
import com.matrix.matrix158springpracticeapp.service.interfaces.SocialMediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialMediaServiceImpl implements SocialMediaService {
    private final SocialMediaRepository socialMediaRepository;

    @Override
    public Optional<SocialMedia> findById(Integer id) {
        return socialMediaRepository.findById(id);
    }

    @Override
    public List<SocialMedia> findAll() {
        return socialMediaRepository.findAll();
    }

    @Override
    public SocialMedia save(SocialMedia socialMedia) {
        return socialMediaRepository.save(socialMedia);
    }

    @Override
    public void deleteById(Integer id) {
        socialMediaRepository.deleteById(id);
    }
}
