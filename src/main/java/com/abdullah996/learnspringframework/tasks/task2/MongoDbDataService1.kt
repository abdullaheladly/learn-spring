package com.abdullah996.learnspringframework.tasks.task2

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
@Primary
open class MongoDbDataService1 : DataService {
    override fun retrieveData(): List<Int> {
        return listOf(1,2,3,4,5)
    }

}