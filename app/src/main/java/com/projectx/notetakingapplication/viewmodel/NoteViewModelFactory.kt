package com.projectx.notetakingapplication.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.projectx.notetakingapplication.repository.NewRepository

class NoteViewModelFactory(
    val app: Application,
    private val noteRepository: NewRepository
): ViewModelProvider.Factory
{

    override fun <T : ViewModel> create(modelClass: Class<T>): T{
        return NoteViewModel(app, noteRepository) as T
    }
}