package com.daniel.gestion_blog.repository;


import com.daniel.gestion_blog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional; // Important pour Optional

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArticleId(Long articleId);

    // Nouvelle méthode pour vérifier l'existence d'un commentaire avec le même article, auteur et contenu
    Optional<Comment> findByArticleIdAndAuteurAndContenu(Long articleId, String auteur, String contenu);
}