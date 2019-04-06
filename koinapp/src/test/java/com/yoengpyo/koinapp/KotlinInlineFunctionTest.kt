package com.yoengpyo.koinapp

import android.util.Log

class KotlinInlineFunctionTest {
    fun String.stringPrint() = println(this)
    fun String.stringPrintToParameter(text : String) = println("$this = $text")
}