package com.example.newsspace.models

data class Event(
    var eventId: String = "",
    var eventName: String = "",
    var eventDesc: String = "",
    var eventPic: String = "",
    var eventDate: String = "",
    var timePosted: Long = 0L,
    var totalLikes: List<String>,
    var societyId: String? = null
)
