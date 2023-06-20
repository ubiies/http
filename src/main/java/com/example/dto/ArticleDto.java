package com.example.dto;

import lombok.Data;

import java.util.List;

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
    private String title; // 안녕하세요
    private String content; /// 만나서 반갑습니다
    private String writer;
    private List<String> comments;
}
