package com.ifucolo.binarytree.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ifucolo.binarytree.domain.model.Comment

@Composable
fun CommentList(
    comments: List<Comment>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .background(color = Color.Black)
    ) {
        items(comments) { comment ->
            CommentItem(comment)
        }
    }
}