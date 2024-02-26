package com.example.apiintegration.api

import com.example.apiintegration.models.Tweet

interface TweetsyAPI {
    fun getTweets(category: String):Response<List<Tweet>>
}