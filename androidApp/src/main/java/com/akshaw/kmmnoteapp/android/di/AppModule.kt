package com.akshaw.kmmnoteapp.android.di

import android.app.Application
import app.cash.sqldelight.db.SqlDriver
import com.akshaw.kmmnoteapp.NoteDatabase
import com.akshaw.kmmnoteapp.data.local.DatabaseDriverFactory
import com.akshaw.kmmnoteapp.data.note.SqlDelightNoteDataSource
import com.akshaw.kmmnoteapp.domain.note.NoteDataSource
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
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}