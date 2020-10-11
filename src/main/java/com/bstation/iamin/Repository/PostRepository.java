package com.bstation.iamin.Repository;

import com.bstation.iamin.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByForPublic(boolean flag);
}
