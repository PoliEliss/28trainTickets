class Train (
    val start:String,
    val end:String,
    val nomer:Int,
    val timeStart:String,
    val timeend:String
    ){

    fun info(){
        println("Поезд под номером $nomer  отправляется с города $start и прибывает в город $end ")
    }

}