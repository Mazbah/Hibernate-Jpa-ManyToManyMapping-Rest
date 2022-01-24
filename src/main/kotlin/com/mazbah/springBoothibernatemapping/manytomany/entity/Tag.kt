package com.mazbah.springBoothibernatemapping.manytomany.entity

import javax.persistence.*

@Entity
@Table(name = "tags")
data class Tag(
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column(name = "name") var name: String? = null,

    @ManyToMany(cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY, mappedBy = "tags")
//    @JoinTable(name = "tags_post",
//        joinColumns = [JoinColumn(name = "tag_id", referencedColumnName = "id")],
//        inverseJoinColumns =  [JoinColumn(name = "post_id", referencedColumnName = "id")]
//    )
    var posts: List<Post>? = null
)