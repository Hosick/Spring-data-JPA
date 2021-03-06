package me.hosick.demospringdata;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;


/*@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)*/
public interface CommentRepository extends MyRepository<Comment, Long>{

    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);

   /* *//*@Query(value = "SELECT c FROM Comment As c", nativeQuery = true)*//*
    List<Comment> findByCommentContains(String keyword);
    Page<Comment> findByLikeCountGreaterThanAndPost(int likeCount, Post post, Pageable pageable);*/
}