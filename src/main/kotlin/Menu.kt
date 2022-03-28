import java.util.*

class Menu (){


     fun  returnTicket(){

         val scanner = Scanner(System.`in`)
         println("Введите номер билета для возврата")
         val numberAnswer = scanner.nextLine()

         if (numberAnswer != null  && numberAnswer != ""){
             println("Ваше заявление будет расмотрено. Мы вернем деньги в течение 10 рабочих л")
         }
     }


}