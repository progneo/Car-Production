package factories

import objects.Car

interface CarFactory {
    fun createSedan(engine: String, transmission: String, numOfSeats: Int): Car
    fun createHatchback(engine: String, transmission: String, numOfSeats: Int): Car
    fun createUniversal(engine: String, transmission: String, numOfSeats: Int): Car
}
