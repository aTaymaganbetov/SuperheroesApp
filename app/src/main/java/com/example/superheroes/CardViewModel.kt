package com.example.superheroes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CardViewModel: ViewModel() {
    val model = Model()

    private var _cardValues = MutableStateFlow(model.getCardValues())

    val cardValues = _cardValues.asStateFlow()


}

class CardValues(val title: String, val description: String, val image: Int)