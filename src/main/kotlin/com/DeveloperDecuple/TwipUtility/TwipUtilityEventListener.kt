package com.DeveloperDecuple.TwipUtility

import java.util.*

interface TwipUtilityEventListener : EventListener {

    fun onDonateReceived(streamer: String, amount: Int, comment: String, nickname: String)

}