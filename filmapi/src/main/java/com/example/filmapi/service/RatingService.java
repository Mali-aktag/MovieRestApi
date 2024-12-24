package com.example.filmapi.service;

import com.example.filmapi.model.Rating;
import com.example.filmapi.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public Optional<Rating> getRatingById(Long id) {
        return ratingRepository.findById(id);
    }

    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public Rating updateRating(Long id, Rating updatedRating) {
        return ratingRepository.findById(id).map(rating -> {
            rating.setScore(updatedRating.getScore());
            rating.setUsername(updatedRating.getUsername());
            return ratingRepository.save(rating);
        }).orElseThrow(() -> new RuntimeException("Rating not found with id: " + id));
    }

    public void deleteRating(Long id) {
        if (ratingRepository.existsById(id)) {
            ratingRepository.deleteById(id);
        } else {
            throw new RuntimeException("Rating not found with id: " + id);
        }
    }

    public List<Rating> findRatingsByMovieId(Long movieId) {
        return ratingRepository.findByMovieId(movieId);
    }

    public List<Rating> findRatingsByUser(String username) {
        return ratingRepository.findByUsername(username);
    }
}
