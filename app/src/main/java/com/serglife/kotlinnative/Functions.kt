package com.serglife.kotlinnative

import java.util.*

fun main(){

    val result = sum(2,3) //
    val result2 = sum(a = 2, b = 3) // Можно указывать имя переменных которым передаем значения
    val result3 = argDefault("Sergey")
    varArgs(2,3,7,5,10,1,666,4)
    varArgs(*intArrayOf(10,50,4,7,9,1),5,7) // Оператор * берет каждий элемент массива и подставляет в функию
}

// простая функия возращает суму чисел
fun sum(a: Int, b: Int) = a + b

// можно указывать аргументы по умолчанию
fun argDefault(name: String = "", age: Int = 0): String {
    return "Name: $name Age: $age"
}

// функция принимает любое кол-во элементов
fun varArgs(vararg numbers: Int){
    numbers.forEach { if( it % 2 == 0) println(it) }
}
