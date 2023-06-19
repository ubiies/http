package com.example.dto;

import lombok.Data;

// 블로그 게시글
// 게시글 - 제목
// 게시글 - 내용
/*
{
    //필드    //value
    "title": "제목",
    "content": "content"
}
*    */
@Data
public class ArticleDto {
    private String title;
    private String content;
}
