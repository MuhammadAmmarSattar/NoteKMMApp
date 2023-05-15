package com.ammar.notekmmapp.data.local.di

import com.ammar.notekmmapp.android.database.NoteDatabase
import com.ammar.notekmmapp.data.local.DatabaseDriverFactory
import com.ammar.notekmmapp.data.note.SqlDelightNoteDataSource
import com.ammar.notekmmapp.domain.note.NoteDataSource


class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}