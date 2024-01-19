package com.abdullah996.learnspringframework.examples.e1

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.Arrays


@Component
open class NormalClass{

}

@Scope(value =ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
open class ProtoTypeScopeClass{

}

@Configuration
@ComponentScan
open class BeanScopeLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(BeanScopeLauncherApplication::class.java)

            println(context.getBean(NormalClass::class.java))
            println(context.getBean(NormalClass::class.java))
            println(context.getBean(NormalClass::class.java))
            println(context.getBean(ProtoTypeScopeClass::class.java))
            println(context.getBean(ProtoTypeScopeClass::class.java))
            println(context.getBean(ProtoTypeScopeClass::class.java))

        }
    }
}