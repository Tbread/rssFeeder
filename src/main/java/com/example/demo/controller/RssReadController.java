package com.example.demo.controller;

import com.example.demo.dto.response.RssResponseDto;
import com.example.demo.service.RssReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RssReadController {
    private final RssReadService rssReadService;


    @GetMapping("/test")
    public String test(@RequestParam String rssLink) throws IOException {
        return rssReadService.readRssPage(rssLink);
    }

    @GetMapping("/read")
    public List<RssResponseDto> readRss(@RequestParam String rssLink) throws IOException, ParserConfigurationException, SAXException {
        return rssReadService.readAndParse(rssLink);
    }
}
