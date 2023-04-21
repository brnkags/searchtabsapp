package com.example.searchtabsapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

sealed class TabItem(var icon: Int, var title: String, var screen: @Composable () -> Unit) {
    object Music : TabItem(R.drawable.baseline_music_note_24, "Music", { MusicScreen() })
    object Movies : TabItem(R.drawable.baseline_local_movies_24, "Movies", { MoviesScreen() })


    companion object {
        private val allTabs = listOf(Music, Movies)
        fun getTabs(): List<TabItem> = remember { allTabs }
    }
}
