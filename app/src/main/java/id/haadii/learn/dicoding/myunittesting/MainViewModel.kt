package id.haadii.learn.dicoding.myunittesting

class MainViewModel(private val cuboidModel: CuboidModel){

    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(l, w, h)
    }

    fun getCircumference() : Double {
        return cuboidModel.circumference
    }

    fun getSurfaceArea() : Double {
        return cuboidModel.surfaceArea
    }

    fun getVolume() : Double {
        return cuboidModel.volume
    }
}