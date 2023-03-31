package objects

class ManualUniversal(
    override val engine: String,
    override val transmission: String,
    override val numOfSeats: Int
) : ManualCar() {
    private var isThirdRowOccupied = false
    override fun displayState() {
        println("The station wagon third row is ${if (isThirdRowOccupied) "occupied" else "unoccupied"}")
    }

    fun occupyThirdRow() {
        isThirdRowOccupied = true
        println("The station wagon third row is occupied")
    }

    fun unoccupyThirdRow() {
        isThirdRowOccupied = false
        println("The station wagon third row is unoccupied")
    }
}
