# BinaryTree and Recursion in Android Project

This project demonstrates the use of **Binary Tree** and **recursion** to manage and display comments and replies in an Android app. It aims to efficiently represent comment hierarchies like those seen on platforms such as Reddit and Instagram.

## Overview

- **Binary Tree for Comments**: Instead of using simple nested lists, a Binary Tree structure is used for storing comments and their replies to improve performance.
- **Data Structure**: A `Comment` class represents each comment, with a list of children (replies).
- **Recursion for Display**: Recursion is used to display nested comments in the UI, with Jetpack Compose for rendering.

## Key Concepts

- **Comment Class**: Each comment has an `id`, `parentId`, and `content`, with replies stored as a list of `Comment` objects.
- **Recursive Display**: Recursion is applied in the `CommentItem` composable to display nested replies.
- **Performance**: 
  - **Time Complexity**: O(n) for rendering.
  - **Space Complexity**: O(log n) for balanced trees, O(n) for unbalanced trees.

## Article with all details:

LINK

