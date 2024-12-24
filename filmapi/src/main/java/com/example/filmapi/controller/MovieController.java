package com.example.filmapi.controller;

import com.example.filmapi.model.Movie;
import com.example.filmapi.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.updateMovie(id, movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> findMoviesByTitle(@RequestParam String title) {
        return ResponseEntity.ok(movieService.findMoviesByTitle(title));
    }

    @GetMapping("/genre")
    public ResponseEntity<List<Movie>> findMoviesByGenre(@RequestParam String genre) {
        return ResponseEntity.ok(movieService.findMoviesByGenre(genre));
    }

    @GetMapping("/director")
    public ResponseEntity<List<Movie>> findMoviesByDirector(@RequestParam String director) {
        return ResponseEntity.ok(movieService.findMoviesByDirector(director));
    }
}
