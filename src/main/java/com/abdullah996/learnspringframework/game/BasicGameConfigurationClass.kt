package com.abdullah996.learnspringframework.game

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class BasicGameConfigurationClass {
    @Bean
    open fun marioGame():MarioGame = MarioGame()

    @Bean
    open fun superGame():SuperGame = SuperGame()

    @Bean
    open fun gameConsole() :GamingConsole = MarioGame()

    @Bean
    open fun gameRunner(gameConsole: GamingConsole):GameRunner = GameRunner(gameConsole)
}