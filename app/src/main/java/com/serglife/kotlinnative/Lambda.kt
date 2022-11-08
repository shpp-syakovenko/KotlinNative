package com.serglife.kotlinnative

// Лямбда выражения и методы колекций

fun main(){

    val sumNumber = {a: Int, b: Int -> a + b}

    val list = listOf(2,-3,-4,8,6,-10,44,5)

    val result = list.forEach { it }        // перебирает список
    val result2 = list.map { it * 2 }             // перебирает список и возвращает измененный список
    val result3 = list.filter { it % 2 == 0 }     // возвращает список элементы которого соответствуют условию
    val result4 = list.reduce{sum: Int, x: Int -> sum + x } // возвращает сумму всех элементов
    val result5 = list.sortedByDescending { it }  // сортировка по убыванию
    val result6 = list.sorted()                   // сортировка по возврастанию
    val result7 = list.any { it > 20 }             // вернет true если хотя бы один элемент соответствует условию
    val result8 = list.all { it < 50 }             // вернет true если все элементы удовлетворяют условию
    val (positive, negative) = list.partition { it > 0 } // разделяет список на 2 списка, первый который соответствует условию второй нет
    val result9 = list.take(5)                 // возвращает первые 5 элементов
    val result10 = list.takeLast(5)            // возвращает последние 5 элементов
    val result11 = list.drop(5)                // выбрасывает первые 5 элементов и возвращает оставшие
    val result12 = list.dropLast(5)            // выбрасывает посление 5 элементов и возвращает оставшие
    val result13 = list.reversed()                // делает реверс списка
    val result14 = list.contains(10)              // возвращает true если элемент такой есть в списке
    val result15 = list.joinToString { ", " }       // Превращает список в строку, указываем разделитель
    val result16 = list.indexOf(6)                    // возвращает индекс найденого элемента или -1 если не найдет









}
