package com.abdullah996.learnspringframework.examples.h1

import com.abdullah996.learnspringframework.examples.e1.BeanScopeLauncherApplication
import com.abdullah996.learnspringframework.game.GameRunner
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.util.Arrays


open class XMLConfigurationContextLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = ClassPathXmlApplicationContext("ContextConfiuration.xml")

            Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }


            println(context.getBean("name"))
            println(context.getBean("age"))
            println(context.getBean(GameRunner::class.java).run())

        }
    }
}