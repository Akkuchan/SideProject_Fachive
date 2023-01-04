package com.facaieve.backend;

import com.facaieve.backend.dto.UserDto;
import com.facaieve.backend.entity.user.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity userPostDtoToUserEntity(UserDto.PostUserDto postUserDto);

    UserEntity userPatchDtoToUserEntity(UserDto.PatchUserDto patchUserDto);

    UserEntity userGetDtoToUserEntity(UserDto.GetUserDto getUserDto);

    UserEntity userDeleteDtoToUserEntity(UserDto.DeleteUserDto deleteUserDto);

    UserDto.ResponseUserDto userEntityToResponseDto(UserEntity userEntity);

}
