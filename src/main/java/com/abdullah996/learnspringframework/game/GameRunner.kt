package com.abdullah996.learnspringframework.game

import org.springframework.stereotype.Component


@Component
open class GameRunner(private val game: GamingConsole) {

    fun run (){
        print("Runnung game : $game" )
        game.up()
        game.down()
        game.left()
        game.right()
    }

}
