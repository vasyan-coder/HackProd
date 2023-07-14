package com.vasyancoder.HackProd.mapper;

import com.vasyancoder.HackProd.dto.UserDto;
import com.vasyancoder.HackProd.entity.UserEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}
