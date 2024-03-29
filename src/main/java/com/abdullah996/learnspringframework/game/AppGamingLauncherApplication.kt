package com.abdullah996.learnspringframework.game

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.abdullah996.learnspringframework.game")
open class AppGamingLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(AppGamingLauncherApplication::class.java)

            context.use { myContext ->
                println(myContext.getBean(GameRunner::class.java).run())
            }
        }
    }
}