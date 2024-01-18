package com.abdullah996.learnspringframework.game

import org.springframework.context.annotation.AnnotationConfigApplicationContext

object App01GamingBasic {


    @JvmStatic
    fun main(args: Array<String>) {

        val context = AnnotationConfigApplicationContext(BasicGameConfigurationClass::class.java)

        try {
            context.getBean("gameRunner")
            context.getBean("marioGame")
            context.getBean("superGame")
            println( context.getBean(GameRunner::class.java).run())
        }finally {
            context.close()
        }
    }



}