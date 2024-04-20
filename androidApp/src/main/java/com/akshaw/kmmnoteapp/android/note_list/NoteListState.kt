package com.akshaw.kmmnoteapp.android.note_list

import com.akshaw.kmmnoteapp.domain.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
