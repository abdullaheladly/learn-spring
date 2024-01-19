package com.abdullah996.learnspringframework.game

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component




@Component
open class GameRunner( @Qualifier("thirdGameQualifier") private val game: GamingConsole) {

    fun run (){
        print("Runnung game : $game" )
        game.up()
        game.down()
        game.left()
        game.right()
    }

}
