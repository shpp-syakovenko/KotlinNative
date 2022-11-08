package com.serglife.kotlinnative

fun main(){
    // Оператор if может возвращать значение
    val b = false
    val res = if(b) "true" else "false"

    // Смарткаст, если обьект является определенного типа от он автоматически приводится к нужному типу
    val obj = Animal("Dog", 12)
    if(obj is Animal){
        val obj2 = obj
    }

    // Оператор when для сравнения значения
    val age = 32
    when(age){
        10 -> println("10")
        in 0..20 -> println("Проверка входит ли в диапазон")
        32 -> println("32")
        else -> println("...")
    }
}

class Animal(name: String, age: Int){}