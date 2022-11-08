package com.serglife.kotlinnative

fun main(){
    // Диапазоны
    if(5 in 0..10){
        println("5 входит в диапазон от 0 до 10 вернет true")
    }

    val list = listOf(1,22,3,4,5,6,7,8,9,10)

    println("-----------------")
    // перебор списка
    for(value in list)
        println(value)

    println("-----------------")
    // перебор списка где index является позиция в списке
    for (index in 0 until list.size)
        println(index)

    println("-----------------")
    // перебор списка где index является позиция в списке
    for (index in list.indices)
        println(index)

    println("-----------------")
    // перебор массива с конца
    for (index in list.size -1 downTo 0)
        println(index)

    println("-----------------")
    //Перебор списка с шагом
    for(index in list.indices step 2)
        println(index)

    println("-----------------")
    // Перебор списка с индексом и значением
    for ((index, value) in list.withIndex()){
        println("Index: $index Value: $value")
    }

    println("-----------------")
    // цикл while
    var a = 0
    while (a < 10){
        println("$a")
        a++
    }

}