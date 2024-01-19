package com.abdullah996.learnspringframework.examples.a1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.*


//yourBusinessClass
//dependency 1
//dependency 2


// field injection
/*@Component
open class YourBusinessClass{
    @Autowired
    private lateinit var dependency1:Dependency1
    @Autowired
    private lateinit var dependency2: Dependency2


    override fun toString(): String {
        return "Using $dependency1 and $dependency2"
    }

}*/

// constructor injection
@Component
open class YourBusinessClass @Autowired constructor(private val dependency1: Dependency1, private val dependency2: Dependency2){



    override fun toString(): String {
        return "Using $dependency1 and $dependency2"
    }

}


// setter injection
/*@Component
open class YourBusinessClass{
    private lateinit var dependency1:Dependency1
    private lateinit var dependency2: Dependency2


    @Autowired
   fun setDependency1(dependency1: Dependency1){
       this.dependency1=dependency1
   }


    @Autowired
    fun setDependency2(dependency2: Dependency2){
        this.dependency2=dependency2
    }


    override fun toString(): String {
        return "Using $dependency1 and $dependency2"
    }

}*/



@Component
open class Dependency1{

}


@Component
open class Dependency2{

}



@Configuration
@ComponentScan
open class DepInjectionLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(DepInjectionLauncherApplication::class.java)

            Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }
            println(context.getBean(YourBusinessClass::class.java))

        }
    }
}