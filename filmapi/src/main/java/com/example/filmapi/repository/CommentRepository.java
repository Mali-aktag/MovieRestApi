package com.example.filmapi.repository;

import com.example.filmapi.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    // Bir filme ait tüm yorumları listeleme
    List<Comment> findByMovieId(Long movieId);

    // Belirli bir kullanıcı tarafından yapılan tüm yorumları listeleme
    List<Comment> findByUser(String user);
}
