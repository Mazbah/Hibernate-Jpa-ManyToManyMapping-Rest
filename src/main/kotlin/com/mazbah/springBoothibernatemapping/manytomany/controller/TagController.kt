package com.mazbah.springBoothibernatemapping.manytomany.controller

import com.mazbah.springBoothibernatemapping.manytomany.entity.Tag
import com.mazbah.springBoothibernatemapping.manytomany.repository.TagRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tag")
class TagController(private val tagRepository: TagRepository)
{
    @GetMapping("/all")
    fun getTag(): List<Tag> {
        return tagRepository.findAll()
    }

    @PostMapping("/update")
    fun update(@RequestBody tag: Tag): Tag {
        return tagRepository.save(tag)
    }
}