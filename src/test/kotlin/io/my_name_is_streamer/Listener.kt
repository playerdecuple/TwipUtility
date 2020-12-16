package io.my_name_is_streamer

import com.DeveloperDecuple.TwipUtility.TwipUtilityEventHandler
import com.DeveloperDecuple.TwipUtility.TwipUtilityEventListener

class Listener: TwipUtilityEventListener {

    fun Listener() {
        TwipUtilityEventHandler.addListener(this)
    }

    override fun onDonateReceived(streamer: String, amount: Int, comment: String, nickname: String) {
        println("$nickname 님이 $streamer 님에게 $amount 원 후원! \"$comment\"")
    }

}