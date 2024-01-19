package com.abdullah996.learnspringframework.tasks.task1

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
@Primary
@Component
open class MongoDbDataService : DataService {
    override fun retrieveData(): List<Int> {
        return listOf(1,2,3,4,5)
    }

}