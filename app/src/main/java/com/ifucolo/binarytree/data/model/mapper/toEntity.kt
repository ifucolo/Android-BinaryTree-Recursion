package com.ifucolo.binarytree.data.model.mapper

import com.ifucolo.binarytree.data.model.CommentEntity
import com.ifucolo.binarytree.domain.model.Comment

fun Comment.toEntity(): CommentEntity {
    return CommentEntity(id, parentId, content)
}