package com.ifucolo.binarytree.data.repository

import com.ifucolo.binarytree.data.local.CommentDao
import com.ifucolo.binarytree.data.model.CommentEntity
import com.ifucolo.binarytree.domain.model.Comment
import com.ifucolo.binarytree.domain.model.mapper.toDomain
import javax.inject.Inject

class CommentRepository @Inject constructor(
    private val commentDao: CommentDao
) {
    suspend fun getAllComments(): List<Comment> {
        return mock().map { it.toDomain() }
        //return commentDao.getAllComments().map { it.toDomain() }
    }

    private fun mock(): List<CommentEntity> = listOf(
        CommentEntity(id = 1, parentId = null, content = "Root comment 1"),
        CommentEntity(id = 2, parentId = 1, content = "Child comment 1 of root 1"),
        CommentEntity(id = 3, parentId = 1, content = "Child comment 2 of root 1"),
        CommentEntity(id = 4, parentId = 3, content = "Child comment 1 of Child comment 2"),
        CommentEntity(id = 5, parentId = 3, content = "Child comment 2 of Child comment 2"),
        CommentEntity(id = 6, parentId = 5, content = "Child comment 1 of Child comment 2 of root 1"),
        CommentEntity(id = 7, parentId = null, content = "Root comment 2"),
        CommentEntity(id = 8, parentId = 7, content = "Child comment 1 of root 2"),
        CommentEntity(id = 9, parentId = 8, content = "Child comment 1 of Child comment 1 of root 2"),
        CommentEntity(id = 10, parentId = 9, content = "Child comment 1 of Child comment 1 of Child comment 1 of root 2"),
        CommentEntity(id = 11, parentId = 7, content = "Child comment 2 of root 2"),
        CommentEntity(id = 12, parentId = 11, content = "Child comment 1 of Child comment 2 of root 2"),
        CommentEntity(id = 13, parentId = 11, content = "Child comment 2 of Child comment 2 of root 2"),
        CommentEntity(id = 14, parentId = 13, content = "Child comment 1 of Child comment 2 of Child comment 2 of root 2"),
        CommentEntity(id = 15, parentId = null, content = "Root comment 3"),
        CommentEntity(id = 16, parentId = 15, content = "Child comment 1 of root 3"),
        CommentEntity(id = 17, parentId = 15, content = "Child comment 2 of root 3"),
        CommentEntity(id = 18, parentId = 17, content = "Child comment 1 of Child comment 2 of root 3"),
        CommentEntity(id = 19, parentId = 18, content = "Child comment 1 of Child comment 1 of Child comment 2 of root 3"),
        CommentEntity(id = 20, parentId = null, content = "Root comment 4"),
        CommentEntity(id = 21, parentId = 20, content = "Child comment 1 of root 4"),
        CommentEntity(id = 22, parentId = 21, content = "Child comment 1 of Child comment 1 of root 4"),
        CommentEntity(id = 23, parentId = 22, content = "Child comment 1 of Child comment 1 of Child comment 1 of root 4"),
        CommentEntity(id = 24, parentId = 21, content = "Child comment 2 of Child comment 1 of root 4"),
        CommentEntity(id = 25, parentId = 20, content = "Child comment 2 of root 4")
    )
}