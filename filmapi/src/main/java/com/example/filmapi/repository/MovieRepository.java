package com.example.filmapi.repository;

import com.example.filmapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // Film başlığına göre arama
    List<Movie> findByTitleContainingIgnoreCase(String title);

    // Belirli bir türe göre filmleri listeleme
    List<Movie> findByGenreIgnoreCase(String genre);

    // Yönetmene göre filmleri listeleme
    List<Movie> findByDirectorIgnoreCase(String director);
}
