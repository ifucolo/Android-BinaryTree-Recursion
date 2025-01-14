package com.ifucolo.binarytree.data.local

import androidx.room.Dao
import androidx.room.Query
import com.ifucolo.binarytree.data.model.CommentEntity

@Dao
interface CommentDao {
    @Query("SELECT * FROM comments")
    fun getAllComments(): List<CommentEntity>
}