package com.daniel.gestion_blog.service;


import com.daniel.gestion_blog.dto.CommentRequestDTO;
import com.daniel.gestion_blog.dto.CommentResponseDTO;

import java.util.List;

public interface CommentService {
    CommentResponseDTO addCommentToArticle(Long articleId, CommentRequestDTO commentRequestDTO);
    List<CommentResponseDTO> getCommentsByArticleId(Long articleId);
    CommentResponseDTO getCommentById(Long id);
    CommentResponseDTO updateComment(Long id, CommentRequestDTO commentRequestDTO);
    void deleteComment(Long id);
}