package com.ifucolo.binarytree.domain.usecase.mapper

import com.ifucolo.binarytree.domain.model.Comment

fun buildCommentTree(comments: List<Comment>): List<Comment> {
    val commentMap = comments.associateBy { it.id }
    val rootComments = mutableListOf<Comment>()

    comments.forEach { comment ->
        if (comment.parentId == null) {
            rootComments.add(comment)
        } else {
            commentMap[comment.parentId]?.children?.add(comment)
        }
    }

    return rootComments
}
