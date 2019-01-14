package com.haiyu.blog.service;

import com.haiyu.blog.po.Comment;

import java.util.List;

/**
 * Created by lyq on 2018/3/12.
 */
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
