package com.abdullah996.learnspringframework.game

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component


@Component
@Qualifier("thirdGameQualifier")
open class ThirdGame : GamingConsole{
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
