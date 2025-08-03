package com.daniel.gestion_blog.repository;


import com.daniel.gestion_blog.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Indique à Spring que c'est un composant de repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    // JpaRepository fournit déjà toutes les méthodes CRUD de base :
    // save(), findById(), findAll(), deleteById(), etc.

    Optional<Article> findByTitre(String titre);
}