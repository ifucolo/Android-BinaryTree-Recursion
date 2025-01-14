package com.ifucolo.binarytree.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comments")
data class CommentEntity(
    @PrimaryKey val id: Int,
    val parentId: Int?,
    val content: String
)