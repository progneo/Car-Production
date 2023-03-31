package factories

import objects.AutomaticHatchback
import objects.AutomaticSedan
import objects.AutomaticUniversal

class AutomaticAssemblyFactory : CarFactory {
    override fun createSedan(engine: String, transmission: String, numOfSeats: Int) = AutomaticSedan(engine, transmission, numOfSeats)
    override fun createHatchback(engine: String, transmission: String, numOfSeats: Int) = AutomaticHatchback(engine, transmission, numOfSeats)
    override fun createUniversal(engine: String, transmission: String, numOfSeats: Int) = AutomaticUniversal(engine, transmission, numOfSeats)
}
