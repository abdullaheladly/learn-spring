package com.abdullah996.learnspringframework.game

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component


@Component
@Primary
open class MarioGame : GamingConsole {
    override fun up(){
        println("Jump")
    }
    override fun down(){
        println("Go into a hole")
    }
    override fun left(){
        println("Go Back")
    }
    override fun right(){
        println("Accelerate")
    }

}
