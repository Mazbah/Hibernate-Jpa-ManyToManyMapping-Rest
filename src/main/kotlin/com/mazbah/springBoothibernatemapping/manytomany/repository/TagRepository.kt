package com.mazbah.springBoothibernatemapping.manytomany.repository

import com.mazbah.springBoothibernatemapping.manytomany.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository: JpaRepository<Tag, Long>