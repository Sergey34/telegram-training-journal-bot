package telegram.training.jornal.bot.actions

import com.github.kotlintelegrambot.dispatcher.Dispatcher
import com.github.kotlintelegrambot.dispatcher.text

fun Dispatcher.ping() {
    text("ping") {
        bot.sendMessage(chatId = message.chat.id, text = "Pong")
    }
}
