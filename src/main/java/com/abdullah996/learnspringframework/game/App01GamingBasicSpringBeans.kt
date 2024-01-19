package com.abdullah996.learnspringframework.game

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.abdullah996.learnspringframework.game")
open class App01GamingBasicSpringBeans {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(App01GamingBasicSpringBeans::class.java)

            context.use { context ->
                println(context.getBean(GameRunner::class.java).run())
            }
        }
    }
}