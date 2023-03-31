package objects

interface Car {
    val engine: String
    val transmission: String
    val numOfSeats: Int

    fun startEngine()
    fun stopEngine()
    fun shiftGear()
    fun displayState()
}
