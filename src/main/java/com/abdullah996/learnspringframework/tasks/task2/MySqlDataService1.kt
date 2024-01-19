package com.abdullah996.learnspringframework.tasks.task2

import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Repository
open class MySqlDataService1 : DataService {
    override fun retrieveData(): List<Int> {
        return listOf(11,12,13,14,15)
    }

}