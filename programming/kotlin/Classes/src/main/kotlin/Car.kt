class Car() {
    private var availableCars = arrayOf("Audi","BMW","Mercedes","Porsche","Ferrari")
    private var currentCar = ""
    private var carAvailable = false
    private var isTurnedOn = false
    private var currentSpeed = 0

    fun chooseCar() {
        println("""
            Which car do you want to use?
            --Audi
            --BMW
            --Mercedes
            --Porsche
            --Ferrari
        """.trimIndent())

        do {
            when (readln()) {
                "Audi"     -> {carAvailable = true; currentCar = availableCars[0]}
                "BMW"      -> {carAvailable = true; currentCar = availableCars[1]}
                "Mercedes" -> {carAvailable = true; currentCar = availableCars[2]}
                "Porsche"  -> {carAvailable = true; currentCar = availableCars[3]}
                "Ferrari"  -> {carAvailable = true; currentCar = availableCars[4]}
                else       -> println("Car not available")
            }
        } while (!carAvailable)
    }

    fun startEngine() {
        println("vroom vroom vroom vrooooooooooom")
        Thread.sleep(3000)
        println("Your $currentCar is now turned on.")
        Thread.sleep(1000)
        isTurnedOn = true
    }

    fun drive(speed: Int) {
        if (isTurnedOn) {
            if (speed > 0) {
                println("Car is driving at ${speed}km/h")
            } else {
                println("Car is parked")
            }
        } else {
            println("Cannot drive car with the engine turned off...")
        }
        currentSpeed = speed
    }

    fun turnOffEngine() {
        if (isTurnedOn && currentSpeed == 0) {
            isTurnedOn = false
            println("Engine turned off successfully")
        } else if (currentSpeed > 0){
            println("Cannot turn off engine while driving")
        } else {
            println("Engine already turned off")
        }
    }

}
