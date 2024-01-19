package com.abdullah996.learnspringframework.examples.d1

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component
import java.util.Arrays


@Component
open class ClassA{

}
@Component
@Lazy
open class ClassB constructor(private val classA: ClassA){

    init {
        println("Some initialization")
    }

}





@Configuration
@ComponentScan
open class LazyInitializationLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(LazyInitializationLauncherApplication::class.java)

           /* Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }*/

            println("completed")

            context.getBean(ClassB::class.java)

        }
    }
}