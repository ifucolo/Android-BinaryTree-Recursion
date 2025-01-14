package com.ifucolo.binarytree.ui.screens.comments

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.ifucolo.binarytree.ui.components.CommentList

@Composable
fun CommentsScreen(
    modifier: Modifier = Modifier,
    viewModel: CommentsViewModel = hiltViewModel(),
) {
    val comments by viewModel.comments.collectAsState(initial = emptyList())

    CommentList(
        comments = comments,
        modifier = modifier
    )
}