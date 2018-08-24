package com.cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.cooksys.entity.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer> {

}