package com.quizbot.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class BotInit {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new TelegramBot("KanolBotBot", "746768887:AAEYjGGkKfdrKra74DgJFtek7QtLRNPNhAM"));
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
