package me.ahnwoohyun.springbootdeveloper.dto;

import lombok.Getter;
import me.ahnwoohyun.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String content;
    private final String imageUrl;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.imageUrl = article.getImageUrl();
    }
}
