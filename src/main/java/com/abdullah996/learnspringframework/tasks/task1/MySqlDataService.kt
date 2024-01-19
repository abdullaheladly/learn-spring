package com.abdullah996.learnspringframework.tasks.task1

import org.springframework.stereotype.Component

@Component
open class MySqlDataService : DataService {
    override fun retrieveData(): List<Int> {
        return listOf(11,12,13,14,15)
    }

}