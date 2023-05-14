package com.ammar.notekmmapp.android.di

import android.app.Application
import com.ammar.notekmmapp.android.database.NoteDatabase
import com.ammar.notekmmapp.data.local.DatabaseDriverFactory
import com.ammar.notekmmapp.data.note.SqlDelightNoteDataSource
import com.ammar.notekmmapp.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideSqlDriver(app: Application):SqlDriver{
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver):NoteDataSource{
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}