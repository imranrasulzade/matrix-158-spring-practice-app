package com.matrix.matrix158springpracticeapp.mapper;

import com.matrix.matrix158springpracticeapp.dto.request.SocialMediaRequest;
import com.matrix.matrix158springpracticeapp.entity.SocialMedia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SocialMediaMapper {
    @Mapping(source = "teacher", target = "teacher")
    SocialMedia entityToSocialMediaResponse(SocialMedia socialMedia);
    SocialMedia toEntity(SocialMediaRequest socialMediaRequest);
}
