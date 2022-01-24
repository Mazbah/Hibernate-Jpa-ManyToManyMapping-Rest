package com.mazbah.springBoothibernatemapping.manytomany.repository

import com.mazbah.springBoothibernatemapping.manytomany.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: JpaRepository<Post, Long>