package com.example.myquizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        questionsList.add(
            Question(
                1,
                R.string.what_country_question,
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Italy",
                "Spain",
                "Portugal",
                1
            )
        )
        questionsList.add(
            Question(
                2,
                R.string.what_country_question,
                R.drawable.ic_flag_of_australia,
                "USA",
                "Australia",
                "New Zeland",
                "Denmark",
                2
            )
        )
        questionsList.add(
            Question(
                3,
                R.string.what_country_question,
                R.drawable.ic_flag_of_new_zealand,
                "India",
                "Brazil",
                "Austria",
                "New Zeland",
                4
            )
        )
        return questionsList
    }
}