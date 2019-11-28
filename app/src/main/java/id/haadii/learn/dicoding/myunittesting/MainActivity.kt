package id.haadii.learn.dicoding.myunittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = MainViewModel(CuboidModel())
    }

    override fun onClick(v: View) {
        val length = edt_length.text.toString().trim()
        val width = edt_width.text.toString().trim()
        val height = edt_height.text.toString().trim()

        if (TextUtils.isEmpty(length)) {
            edt_length.error = "Field ini tidak boleh kosong"
        } else if (TextUtils.isEmpty(width)) {
            edt_width.error = "Field ini tidak boleh kosong"
        } else if (TextUtils.isEmpty(height)) {
            edt_height.error = "Field ini tidak boleh kosong"
        } else {
            val l = length.toDouble()
            val w = length.toDouble()
            val h = length.toDouble()

            when (v.id) {
                R.id.btn_save -> {
                    mainViewModel.save(l, w, h)
                    visible()
                }
                R.id.btn_calculate_circumference -> {
                    tv_result.text = mainViewModel.getCircumference().toString()
                    gone()
                }
                R.id.btn_calculate_surface_area -> {
                    tv_result.text = mainViewModel.getSurfaceArea().toString()
                    gone()
                }
                R.id.btn_calculate_volume -> {
                    tv_result.text = mainViewModel.getVolume().toString()
                    gone()
                }
            }
        }
    }

    private fun visible() {
        btn_calculate_circumference.visibility = View.VISIBLE
        btn_calculate_surface_area.visibility = View.VISIBLE
        btn_calculate_volume.visibility = View.VISIBLE
        btn_save.visibility = View.GONE
    }

    private fun gone() {
        btn_calculate_volume.visibility = View.GONE
        btn_calculate_surface_area.visibility = View.GONE
        btn_calculate_circumference.visibility = View.GONE
        btn_save.visibility = View.VISIBLE
    }
}
