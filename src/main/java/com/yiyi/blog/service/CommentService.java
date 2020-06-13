package com.yiyi.blog.service;

import com.yiyi.blog.po.Comment;

import java.util.List;

/**
 * Created by Yi Yang on 2020/06/10.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
