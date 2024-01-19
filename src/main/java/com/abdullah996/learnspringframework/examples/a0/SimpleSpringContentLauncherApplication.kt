package com.abdullah996.learnspringframework.examples.a0

import com.abdullah996.learnspringframework.examples.e1.BeanScopeLauncherApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import java.util.Arrays

@Configuration
@ComponentScan
open class SimpleSpringContentLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(BeanScopeLauncherApplication::class.java)

            Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }

        }
    }
}