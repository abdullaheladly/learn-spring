package com.abdullah996.learnspringframework.game

class AppGamingBasic {
    var marioGame = MarioGame()
    var gameRunner = GameRunner(marioGame)

    init {
        gameRunner.run()
        marioGame.up()
        marioGame.down()
        marioGame.left()
        marioGame.right()
    }


}