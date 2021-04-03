package com.czu.backend.project.semestral.repository;

import com.czu.backend.project.semestral.model.Comment;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CommentsRepository extends ReactiveCrudRepository<Comment, Integer> {
}