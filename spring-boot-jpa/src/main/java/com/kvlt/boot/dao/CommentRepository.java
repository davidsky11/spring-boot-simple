package com.kvlt.boot.dao;

import com.kvlt.boot.entity.Comment;

import java.util.List;

/**
 * CommentRepository
 *
 * @author KVLT
 * @date 2017-12-17.
 */
public interface CommentRepository extends CustomRepository<Comment, Integer> {

    List<Comment> findByUserId(Integer userId);

}
