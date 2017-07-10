data class Movie(val name: String, val price: Int)

interface ICinema {
    fun open()
    fun close()
    fun initMovie()
}

abstract class Cinema : ICinema {
    abstract var name: String
    abstract var playMovie: Movie

    override fun open() {}

    override fun close() {}

    override fun initMovie() {}

    fun isOverPrice(): Boolean = playMovie.price > 15

    fun printMessage() {
        println("is The price is over 15 : ${isOverPrice()}")
        println("the cinema is play movie named ${playMovie.name}")
    }
}

class DayCinema : Cinema() {
    override var name = "DayCinema"
    override var playMovie = Movie("金刚", 25)

    override fun open() {
        print("open at 8:00 am")
    }

    override fun close() {
        print("close at 6:00 pm")
    }

    override fun initMovie() {
        //override var playMovie = Movie("金刚", 25)
        //name = "DayCinema"
        //playMovie = Movie("金刚", 25)
    }


}

class NightCinema : Cinema() {
    override var name = "NightCinema"
    override var playMovie = Movie("三打白骨精", 15)

    override fun open() {
        print("open at 8:00 pm")
    }

    override fun close() {
        print("close at 6:00 am")
    }

    override fun initMovie() {
        //override var playMovie = Movie("金刚", 25)
        //name = "NightCinema"
        //playMovie = Movie("三打白骨精", 15)
    }
}

fun main(args: Array<String>) {
    val cinemaDay = DayCinema()
    cinemaDay.printMessage()

    val cinemaNight = NightCinema()
    cinemaNight.printMessage()
}
