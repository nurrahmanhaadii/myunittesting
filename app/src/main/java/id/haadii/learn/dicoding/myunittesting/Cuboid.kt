package id.haadii.learn.dicoding.myunittesting

data class Cuboid(
    val width: Double,
    val length: Double,
    val height: Double
) {

    fun getVolume() : Double {
        return width * length * height
    }

    fun getSurfaceArea() : Double {
        val wl = width * length
        val wh = width * height
        val lh = length * height

        return 2 * (wl + wh + lh)
    }

    fun getCircumference() : Double {
        return 4 * (width * length * height)
    }
}