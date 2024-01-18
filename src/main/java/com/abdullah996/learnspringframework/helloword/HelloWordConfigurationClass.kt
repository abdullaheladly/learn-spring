package com.abdullah996.learnspringframework.helloword

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary


data class Person (val name:String,val age:Int,val address: Address)
@Configuration
open class HelloWordConfigurationClass() {

    @Bean
     open fun name():String{
        return "Abdullah"
    }

    @Bean
    open fun age():Int{
        return 27
    }

    @Bean
    open fun person():Person = Person("Abdullah",20, Address("",""))
    @Bean
    open fun person2MethodCall():Person = Person(name(),age(),address1())

    @Bean
    open fun person3Parameters(name: String, age: Int, address: Address):Person = Person(name, age, address)

    @Bean
    @Primary
    open fun person4Parameters(name: String, age: Int, address: Address):Person = Person(name, age, address)

    @Bean
    open fun person5Qualifier(name: String, age: Int, @Qualifier("address2Qualifier") address: Address):Person = Person(name, age, address)
    @Bean(name = ["CustomName"])
    @Primary
    open fun address1():Address = Address("Abdullah","egypt")

    @Bean(name = ["address2"])
    @Qualifier("address2Qualifier")
    open fun address2():Address = Address("Abdullah","UAE")

}