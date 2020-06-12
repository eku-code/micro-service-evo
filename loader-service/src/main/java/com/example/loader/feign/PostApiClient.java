package com.example.loader.feign;

import com.example.loader.entity.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "PostService", url = "https://jsonplaceholder.typicode.com")
public interface PostApiClient {

    @GetMapping("/posts")
    List<Post> getPosts();
}