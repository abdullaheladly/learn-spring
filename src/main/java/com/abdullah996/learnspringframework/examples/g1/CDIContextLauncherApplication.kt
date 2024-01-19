package com.abdullah996.learnspringframework.examples.g1

import jakarta.inject.Inject
import jakarta.inject.Named
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.Arrays
import javax.xml.crypto.Data


//@Component
@Named
open class BusinessService(){
    private lateinit var dataService: DataService

    //@Autowired
    @Inject
    fun setDataService(dataService: DataService){
        println("setterInjection")

        this.dataService=dataService
    }

    fun getDataService():DataService{

        return dataService
    }
}


//@Component
@Named
open class DataService(){

}

@Configuration
@ComponentScan
open class CDIContextLauncherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = AnnotationConfigApplicationContext(CDIContextLauncherApplication::class.java)

            Arrays.stream(context.beanDefinitionNames).forEach {
                println(it)
            }

            println(context.getBean(BusinessService::class.java).getDataService())

        }
    }
}