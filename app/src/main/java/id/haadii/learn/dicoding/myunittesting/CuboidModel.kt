package id.haadii.learn.dicoding.myunittesting

open class CuboidModel {
    var width : Double = 0.toDouble()
    var length : Double = 0.toDouble()
    var height : Double = 0.toDouble()

    val volume : Double
    get() {
        return width * length * height
    }

    val surfaceArea : Double

    get() {
        val wl = width * length
        val wh = width * height
        val lh = length * height

        return 2 * (wl + wh + lh)
    }

    val circumference : Double
    get() = 4 * (width * length * height)

    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }
}