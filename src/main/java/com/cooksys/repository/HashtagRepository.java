package com.cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.cooksys.entity.Hashtag;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag, String> {

}