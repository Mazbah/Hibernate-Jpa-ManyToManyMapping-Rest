package com.mazbah.springBoothibernatemapping.manytomany.controller

import com.mazbah.springBoothibernatemapping.manytomany.entity.Post
import com.mazbah.springBoothibernatemapping.manytomany.repository.PostRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/post")
class PostController(private val postRepository: PostRepository)
{
    @GetMapping("/all")
    fun getPost(): List<Post> {
        return postRepository.findAll()
    }

    @PostMapping("/update")
    fun update(@RequestBody post: Post): Post {
        return postRepository.save(post)
    }
}