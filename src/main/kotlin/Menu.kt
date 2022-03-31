import java.awt.Color
import java.util.*
import kotlin.math.sign

class Menu() {
    val mosscowPiterburg = Train("Москва", "Санкт-Питербург", 207, "09.00", "22.00")
    val mosscowMurmansk = Train("Москва", "Мурманс", 208, "07.00", "06.00")
    val mosscowKrasnodar = Train("Москва", "Краснодар", 201, "09.00", "22.00")
    val mosscowSoci = Train("Москва", "Сочи", 211, "09.00", "22.00")
    val mosscowRostov = Train("Москва", "Ростов", 200, "09.00", "22.00")
    val mosscowPskov = Train("Москва", "Псков", 200, "09.00", "22.00")

    private val listtrain: MutableList<Train> =
        mutableListOf(mosscowKrasnodar, mosscowMurmansk, mosscowSoci, mosscowRostov, mosscowPiterburg,mosscowPskov)

    fun mainMenu() {

        println("Выберите необходимый раздел введя число")
        println( "\u001B[33m"+" Внимание!!! Появились рейсы в Псков "+"\u001B[0m" )
        println("1:Купить билет")
        println("2:Обменять билет")
        if (scanner.hasNextInt()) {
            val numberAnswer = scanner.nextInt()
            if (numberAnswer == 1) {
                shopTicket()
            } else if (numberAnswer == 2) {
                returnTicket()
            }
        } else {
            println("вы ввели не число. Начните сначала")
            mainMenu()
        }
    }

    fun returnTicket() {
        val scanner = Scanner(System.`in`)
        println("Введите номер билета для возврата")
        val numberAnswer = scanner.nextLine()
        if (numberAnswer != null && numberAnswer != "") {
            println("Ваше заявление будет расмотрено. Мы вернем деньги в течение 10 рабочих л")
        }
    }

    fun age(test: String): String {


        val ageProverka: List<String> = test.split(".") // массив получился

        val day = ageProverka[0].toInt()
        val month = ageProverka[1].toInt()
        val year = ageProverka[2].toInt()
        if (!(day > 0 && day <= 31 && month > 0 && month <= 12 && year >= 1800)) {
            println("Введите верную дату")
            val scanner = Scanner(System.`in`)
            val p = scanner.nextLine()
            age(p)
        } else {
            println("Введите дату еще раз")
            val p = scanner.nextLine()
            age(p)
        }
        return test

    }


    fun fio(): List<String> {
        val scanner1 = Scanner(System.`in`)
        println("Введите ФИО")
        val e: Boolean = scanner1.hasNextInt()
        if (!e) {


            val fio2 = scanner1.nextLine()
            val fioArray: List<String> = fio2.split(" ")

            if (fioArray[0].length > 2 && fioArray[1].length > 2 && fioArray[2].length > 2) {

                return fioArray
            } else {
                fio()
                val list: List<String> = listOf()
                return list
            }
        } else {
            println("Вы ввели число вместо ФИО")
            scanner1.next()
            fio()

            val list: List<String> = listOf()
            return list
        }
    }

    fun shopTicket() {
        val scanner = Scanner(System.`in`)
        println("Введите город отправления")
        val townStart = scanner.nextLine()
        println("Введите город прибытия")
        val townEnd = scanner.nextLine()
        listtrain.forEach() {
            if (it.start == townStart && it.end == townEnd) {

                //println("Введите ФИО")
                //  val s = scanner.nextLine()
                val fioArray: List<String> = fio()

                println("Введите год рождения в формате 02.02.1990")
                val p = scanner.nextLine()

                val age = age(p)

                println("Список доступных мест")
                it.placesDostup2()
                println()

                while (true) {
                    println("Введите номер место для бронирования")
                    if (scanner.hasNextInt()) {
                        val places = scanner.nextInt()
                        it.bron(places)
                        break
                    } else {
                        println("Вы ввели не номер")
                    }

                }
                println("Билет приобретен")
                val ticket = Ticket(fioArray[0], fioArray[1], fioArray[2], age)
                mainMenu()
                return
            }


        }

        println("Не найдено")
    }

}




