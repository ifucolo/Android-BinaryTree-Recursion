package com.ifucolo.binarytree.domain.model.mapper

import com.ifucolo.binarytree.data.model.CommentEntity
import com.ifucolo.binarytree.domain.model.Comment

fun CommentEntity.toDomain(): Comment {
    return Comment(id, parentId, content)
}