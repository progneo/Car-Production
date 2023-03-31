package factories

import objects.ManualHatchback
import objects.ManualSedan
import objects.ManualUniversal

class ManualAssemblyFactory : CarFactory {
    override fun createSedan(engine: String, transmission: String, numOfSeats: Int) = ManualSedan(engine, transmission, numOfSeats)
    override fun createHatchback(engine: String, transmission: String, numOfSeats: Int) = ManualHatchback(engine, transmission, numOfSeats)
    override fun createUniversal(engine: String, transmission: String, numOfSeats: Int) = ManualUniversal(engine, transmission, numOfSeats)
}
