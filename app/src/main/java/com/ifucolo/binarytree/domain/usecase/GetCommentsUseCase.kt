package com.ifucolo.binarytree.domain.usecase

import com.ifucolo.binarytree.data.repository.CommentRepository
import com.ifucolo.binarytree.domain.model.Comment
import com.ifucolo.binarytree.domain.usecase.mapper.buildCommentTree
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: CommentRepository
) {
    suspend operator fun invoke(): List<Comment> {
        val comments = repository.getAllComments()
        return buildCommentTree(comments)
    }
}
