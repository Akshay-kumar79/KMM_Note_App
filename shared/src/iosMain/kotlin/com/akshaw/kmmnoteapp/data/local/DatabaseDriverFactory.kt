package com.akshaw.kmmnoteapp.data.local

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.akshaw.kmmnoteapp.NoteDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver{
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}