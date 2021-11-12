package com.example.demo.dto.response;

import lombok.Getter;

@Getter
public class RssResponseDto {
    private String title;
    private String contents;
    private String link;
    private String pubDate;
    private String category;
}
