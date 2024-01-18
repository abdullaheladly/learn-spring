package com.abdullah996.learnspringframework.helloword

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.Arrays

object App02HelloWordSpring {

    @JvmStatic
    fun main(args: Array<String>) {
        // launch spring context
        val context = AnnotationConfigApplicationContext(HelloWordConfigurationClass::class.java)

        try {
            // configure the things spring need to manage

            // retrieve bean by fun name
            println(context.getBean("name"))
            println(context.getBean("age"))
            println(context.getBean("person"))
            println(context.getBean("person5Qualifier"))
            //getBean by Return Type
            println(context.getBean(Address::class.java))
            println(context.getBean(Person::class.java))

            Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }
        }finally {
            context.close()
        }
    }



}