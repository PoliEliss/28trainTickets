import java.util.*

fun main(args: Array<String>) {


    val townList = arrayListOf<Town>()
    townList.add(Town("Moscow"))
    townList.add(Town("Perm"))
    townList.add(Town("Ryazan"))
    townList.add(Town("Kazan"))
    townList.add(Town("Perm"))
    townList.add(Town("Krasnodar"))

// Create Scanner

    val scanner = Scanner(System.`in`)

    println("Выберите необходимый раздел введя число")
    println("1:Купить билет")
    println("2:Обменять билет")

        //take input

    while (true){
        val numberAnswer = scanner.nextLine()

        if (numberAnswer.toInt() == 1){
            println("Введите город отправления")
        }

        val toyn = scanner.nextLine()

        if (toyn == "Анапа"){
            println("Из этого города маршрута нет")
        }

    }


}