package com.abdullah996.learnspringframework.tasks.task2

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service


@Service
open class BusinessCalculationService1 @Autowired constructor(private val dataService: DataService) {

    open fun findMax():Int = dataService.retrieveData().max()
}