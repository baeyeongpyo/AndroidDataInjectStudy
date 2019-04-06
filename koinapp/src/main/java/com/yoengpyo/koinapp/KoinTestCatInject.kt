package com.yoengpyo.koinapp

import org.koin.dsl.module

class Cat(){
    val name = "my cat name"
}

val catModule = module {
    factory { Cat() }
}
