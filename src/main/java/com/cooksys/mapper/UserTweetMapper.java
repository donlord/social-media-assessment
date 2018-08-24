package com.cooksys.mapper;

import org.mapstruct.Mapper;
import com.cooksys.dto.UserTweetDto;
import com.cooksys.entity.Tweet;
import com.cooksys.entity.User;

@Mapper(componentModel = "spring")
public interface UserTweetMapper {

//	UserTweetDto toDtoReq(User u);
//
//	Tweet reqFromDto(UserTweetDto t);

	UserTweetDto TweetToDtoRes(User u);
	
	

}

