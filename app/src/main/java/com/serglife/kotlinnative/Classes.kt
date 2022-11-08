package com.serglife.kotlinnative

fun main(){
    val child = Person("Yana", "Ivanova", 5)
    val person = Person("Sergey", "Yakovenko", 32, child)

    val rectangle = Rectangle(4, 6)
    val rectangle2 = Rectangle(4, 6)

    // Поскольку мы сравниваем data класы то значит методы переопределены автоматически и обьекты равны так как и поля равны
    println(rectangle == rectangle2)

}

// Primary Constructor - Первичный конструктор
class Person(val name: String, val lastName: String, var age: Int){
    var children: MutableList<Person> = mutableListOf()

    // Вторичный конструктор
    constructor(name: String, lastName: String, age: Int, child: Person): this(name, lastName, age){
        children.add(child)
    }

    // Конструктор без аргументов
    constructor():this("","", -1)

    init {
        println("Person is created Name: $name")
    }

    companion object{
        const val USER = "USER"
    }
}
// в data класе переопределены методы ToString(), equels(), hashCode(), componentN(), copy()
data class Rectangle(private val width: Int, private val height:Int){
    var perimater = (width + height) * 2

    var test = 1
    get() = field + 1
    set(value){
        if(value < 0) println("Number is negative")
        field = value
    }

    fun area() = width * height

}