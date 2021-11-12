package com.example.demo.controller;

import com.example.demo.service.RssReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class RssReadController {
    private final RssReadService rssReadService;


    @GetMapping("/test")
    public String test(@RequestParam String rssLink) throws IOException {
        return rssReadService.readRssPage(rssLink);
    }
}
