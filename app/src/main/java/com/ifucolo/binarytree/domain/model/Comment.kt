package com.ifucolo.binarytree.domain.model

data class Comment(
    val id: Int,
    val parentId: Int?,
    val content: String,
    val children: MutableList<Comment> = mutableListOf()
)