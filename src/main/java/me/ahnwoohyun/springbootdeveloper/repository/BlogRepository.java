package me.ahnwoohyun.springbootdeveloper.repository;

import me.ahnwoohyun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
