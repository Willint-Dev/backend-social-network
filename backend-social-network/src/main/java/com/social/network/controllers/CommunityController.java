package com.social.network.controllers;

import com.social.network.data.ImageDto;
import com.social.network.data.MessageDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1/community")
public class CommunityController {

    @GetMapping("/messages")
    public ResponseEntity<List<MessageDto>> getCommunityMessages(@RequestParam(value = "page", defaultValue = "0") int page) {

    }

    @GetMapping("/images")
    public ResponseEntity<List<ImageDto>> getCommunityImages(@RequestParam(value = "page", defaultValue = "0") int page) {

    }

    @PostMapping("/messages")
    public ResponseEntity<MessageDto> postCommunityMessages(@RequestBody MessageDto messageDto) {

    }

    @PostMapping("/images")
    public ResponseEntity<ImageDto> postCommunityImages(@RequestParam MultipartFile file, @RequestParam(value = "title") String title) {

    }
}
