class Train (
    val start:String,
    val end:String,
    val nomer:Int,
    val timeStart:String,
    val timeend:String

    ){

    val placesMap :MutableMap<Int,Boolean> = mutableMapOf(1 to true,2 to true,3 to true,4 to true,5 to true)
    fun info(){
        println("Поезд под номером $nomer  отправляется с города $start и прибывает в город $end ")
    }

        fun placesDostup2() {
            placesMap.forEach { t, u ->
                if (u == true) {
                    print("$t Место свободно ,")
                }
            }
        }

        fun bron(nomerPlaces:Int){
            placesMap[nomerPlaces]=false;
        }


}