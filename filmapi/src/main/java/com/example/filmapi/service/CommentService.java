package com.example.filmapi.service;

import com.example.filmapi.model.Comment;
import com.example.filmapi.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment updateComment(Long id, Comment updatedComment) {
        return commentRepository.findById(id).map(comment -> {
            comment.setContent(updatedComment.getContent());
            comment.setUsername(updatedComment.getUsername());
            comment.setDate(updatedComment.getDate());
            return commentRepository.save(comment);
        }).orElseThrow(() -> new RuntimeException("Comment not found with id: " + id));
    }

    public void deleteComment(Long id) {
        if (commentRepository.existsById(id)) {
            commentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Comment not found with id: " + id);
        }
    }

    public List<Comment> findCommentsByMovieId(Long movieId) {
        return commentRepository.findByMovieId(movieId);
    }

    public List<Comment> findCommentsByUser(String user) {
        return commentRepository.findByUsername(user);
    }
}
