package com.example.demo.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class RssResponseDto {
    private final String title;
    private final String contents;
    private final String link;

    @Builder
    public RssResponseDto(String title, String contents, String link) {
        this.title = title;
        this.contents = contents;
        this.link = link;
    }
}
