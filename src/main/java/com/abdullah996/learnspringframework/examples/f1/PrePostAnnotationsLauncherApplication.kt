package com.abdullah996.learnspringframework.examples.f1

import com.abdullah996.learnspringframework.examples.e1.BeanScopeLauncherApplication
import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.Arrays


@Component
open class SomeClass constructor(private val someDependency: SomeDependency){

    init {
        println("ready")
    }

    @PostConstruct
    fun initialization(){
        someDependency.getReady()
    }
    @PreDestroy
    fun cleanUp(){
        println("CleanUp")
    }

}

@Component
open class SomeDependency{
    fun getReady() {
        println("some logic ")
    }

}

@Configuration
@ComponentScan
open class PrePostAnnotationsLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication::class.java)
            context.use {
                Arrays.stream(it.beanDefinitionNames).forEach {string->
                    println(string)
                }
            }


        }
    }
}