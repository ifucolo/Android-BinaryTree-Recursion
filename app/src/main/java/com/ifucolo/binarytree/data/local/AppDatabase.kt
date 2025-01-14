package com.ifucolo.binarytree.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ifucolo.binarytree.data.model.CommentEntity

@Database(entities = [CommentEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun commentDao(): CommentDao
}