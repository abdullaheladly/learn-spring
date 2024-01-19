package com.abdullah996.learnspringframework.tasks.task1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
open class BusinessCalculationService @Autowired constructor(private val dataService: DataService) {

    open fun findMax():Int = dataService.retrieveData().max()
}