package com.abdullah996.learnspringframework.game

import com.abdullah996.learnspringframework.game.MarioGame

class GameRunner(private val marioGame: MarioGame) {

    fun run (){
        print("Runnung game : $marioGame" )
    }

}
