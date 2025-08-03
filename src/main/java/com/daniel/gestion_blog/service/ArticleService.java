package com.daniel.gestion_blog.service;


import com.daniel.gestion_blog.dto.ArticleRequestDTO;
import com.daniel.gestion_blog.dto.ArticleResponseDTO;

import java.util.List;

public interface ArticleService {
    ArticleResponseDTO createArticle(ArticleRequestDTO articleRequestDTO);
    List<ArticleResponseDTO> getAllArticles();
    ArticleResponseDTO getArticleById(Long id);
    ArticleResponseDTO updateArticle(Long id, ArticleRequestDTO articleRequestDTO);
    void deleteArticle(Long id);
}