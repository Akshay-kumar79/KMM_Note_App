package com.akshaw.kmmnoteapp.android.note_detail

data class NoteDetailState(
    val noteTitle: String = "",
    val isNoteTitleHintVisible: Boolean = false,
    val noteContent: String = "",
    val isNoteContentHintVisible: Boolean = false,
    val noteColor: Long = 0xFFFFFF
)
