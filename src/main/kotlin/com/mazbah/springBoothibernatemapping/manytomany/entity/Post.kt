package com.mazbah.springBoothibernatemapping.manytomany.entity

import javax.persistence.*

@Entity
@Table(name = "posts")
data class Post (
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "title") var title: String? = null,
    @Column(name = "description") var description: String? = null,
    @Column(name = "content") var content: String? = null,

    @ManyToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
    @JoinTable(name = "post_tags",
		joinColumns = [JoinColumn(name = "post_id", referencedColumnName = "id")],
		inverseJoinColumns =  [JoinColumn(name = "tag_id", referencedColumnName = "id")]
    )
    var tags: List<Tag>? = null
)