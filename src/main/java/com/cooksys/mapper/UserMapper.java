package com.cooksys.mapper;

import org.mapstruct.Mapper;

import com.cooksys.dto.UserDtoReq;
import com.cooksys.dto.UserDtoRes;
import com.cooksys.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDtoReq toDtoReq(User u);

	User reqFromDto(UserDtoReq u);

	UserDtoRes toDtoRes(User u);

}
