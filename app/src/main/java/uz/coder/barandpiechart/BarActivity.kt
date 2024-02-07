package uz.coder.barandpiechart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import uz.coder.barandpiechart.databinding.ActivityBarBinding

class BarActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityBarBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val list = arrayListOf<BarEntry>()
        list.add(BarEntry(2002f, 200f))
        list.add(BarEntry(2003f, 300f))
        list.add(BarEntry(2004f, 400f))
        list.add(BarEntry(2005f, 500f))
        list.add(BarEntry(2006f, 600f))
        list.add(BarEntry(2007f, 700f))
        list.add(BarEntry(2008f, 800f))
        list.add(BarEntry(2009f, 900f))
        val barSet = BarDataSet(list, "sinflar sig\'imi")
        barSet.valueTextColor = R.color.black
        barSet.valueTextSize = 17f
        val ints = ColorTemplate.MATERIAL_COLORS.toList()
        barSet.colors = ints
        val barData = BarData(barSet)
        binding.apply {
            barChart.setFitBars(true)
            barChart.data = barData
            barChart.description.text = "Bar Chart Power By AIML"
            barChart.animateY(2000)
        }
    }
}