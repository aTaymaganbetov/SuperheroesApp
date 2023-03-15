package com.example.superheroes

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel {
    val model = Model()

    private var _title = MutableStateFlow("")
    private var _description = MutableStateFlow("")

    val title = _title.asStateFlow()
    val description = _description.asStateFlow()


}