package com.ammar.notekmmapp.android.note_list

import com.ammar.notekmmapp.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)