package com.abdullah996.learnspringframework.game

import com.abdullah996.learnspringframework.game.MarioGame

class GameRunner(private val game: GamingConsole) {

    fun run (){
        print("Runnung game : $game" )
        game.up()
        game.down()
        game.left()
        game.right()
    }

}
