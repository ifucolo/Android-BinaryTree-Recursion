package com.ifucolo.binarytree.di

import android.content.Context
import androidx.room.Room
import com.ifucolo.binarytree.data.local.AppDatabase
import com.ifucolo.binarytree.data.local.CommentDao
import com.ifucolo.binarytree.data.repository.CommentRepository
import com.ifucolo.binarytree.domain.usecase.GetCommentsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app_database"
        ).build()
    }

    @Provides
    fun provideCommentDao(database: AppDatabase): CommentDao {
        return database.commentDao()
    }

    @Provides
    @Singleton
    fun provideCommentRepository(commentDao: CommentDao): CommentRepository {
        return CommentRepository(commentDao)
    }

    @Provides
    @Singleton
    fun provideGetCommentsUseCase(commentRepository: CommentRepository): GetCommentsUseCase {
        return GetCommentsUseCase(commentRepository)
    }
}