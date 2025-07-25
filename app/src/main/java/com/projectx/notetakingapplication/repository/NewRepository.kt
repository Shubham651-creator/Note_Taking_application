package com.projectx.notetakingapplication.repository

import com.projectx.notetakingapplication.database.NoteDatabase
import com.projectx.notetakingapplication.model.Note

class NewRepository(private val db : NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDAO().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDAO().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDAO().updateNote(note)

    fun getAllNotes() = db.getNoteDAO().getAllNotes()
    fun serachNote(query: String?) = db.getNoteDAO().searchNote(query)
}