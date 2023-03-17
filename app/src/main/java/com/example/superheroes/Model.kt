package com.example.superheroes

class Model {
    fun getCardValues(): List<CardValues> {
        val list = listOf<CardValues>(
            CardValues("Nick the Night and Day", "The Jetpacj Hero", R.drawable.man_pic2),
            CardValues("Reality Protector", "Understands the absolute truth", R.drawable.man_pic),
            CardValues("Andre the Giant", "Mimics the light and night to blend in", R.drawable.man_pic2),
            CardValues("Benjamin the Brave", "Harnesses the power of canary to develop bravely", R.drawable.man_pic),
            CardValues("Magnificent Maru", "Effortlessly gildes in to save the day", R.drawable.man_pic2),
            CardValues("Dynamic Yasmine", "Ability ti shift to any form and energize", R.drawable.man_pic),
            CardValues("Nick the Night and Day", "The Jetpacj Hero", R.drawable.man_pic2),
            CardValues("Reality Protector", "Understands the absolute truth", R.drawable.man_pic),
            CardValues("Andre the Giant", "Mimics the light and night to blend in", R.drawable.man_pic2),
            CardValues("Benjamin the Brave", "Harnesses the power of canary to develop bravely", R.drawable.man_pic),
            CardValues("Magnificent Maru", "Effortlessly gildes in to save the day", R.drawable.man_pic2),

            )
        return list
    }
}