package com.ifucolo.binarytree.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ifucolo.binarytree.domain.model.Comment

@Composable
fun CommentItem(comment: Comment, level: Int = 0) {
    val paddingModifier = Modifier.padding(start = (16.dp * level))

    Column(modifier = paddingModifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp)
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Text(
                text = comment.content,
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    color = Color.White
                ),
                modifier = Modifier.fillMaxWidth(),
                softWrap = true
            )
        }

        comment.children.forEach { child ->
            CommentItem(comment = child, level = level + 1)
        }
    }
}

