import java.util.*

class Menu() {
    fun glavMenu() {
        println("Выберите необходимый раздел введя число")
        println("1:Купить билет")
        println("2:Обменять билет")
        if (scanner.hasNextInt()) {
            val numberAnswer = scanner.nextInt()
            if (numberAnswer == 1) {
                shopTicket()
            }else if (numberAnswer==2){
                returnTicket()
            }
        } else {
            println("вы ввели не число . Начните сначало")
            glavMenu()
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

    fun shopTicket() {
        println("Введите ФИО")
        var fio = scanner.nextLine()
        var fioArray: List<String> =  fio.split(" ")

        println("Введите год рождения в форате 02.02.1990")
        var age = scanner.nextLine()

        val ticket:Ticket = Ticket(fioArray[0],fioArray[1],fioArray[2],age)
        var r=2


    }


}