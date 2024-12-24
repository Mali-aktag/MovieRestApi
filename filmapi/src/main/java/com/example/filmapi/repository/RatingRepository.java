package com.example.filmapi.repository;

import com.example.filmapi.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

    // Bir filme ait tüm puanları listeleme
    List<Rating> findByMovieId(Long movieId);

    // Belirli bir kullanıcı tarafından yapılan tüm puanlamaları listeleme
    List<Rating> findByUser(String user);
}
