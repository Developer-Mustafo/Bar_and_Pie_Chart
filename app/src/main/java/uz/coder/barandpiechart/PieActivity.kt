package uz.coder.barandpiechart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import uz.coder.barandpiechart.databinding.ActivityPieBinding

class PieActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityPieBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val list = arrayListOf<PieEntry>()
        //something daganni o'rnina hologanni qo'ysa bo'ladi
        list.add(PieEntry(3235461f, "Something1"))
        list.add(PieEntry(3235462f, "Something2"))
        list.add(PieEntry(3235463f, "Something3"))
        list.add(PieEntry(3235464f, "Something4"))
        //o'rtadagi debtors dagan
        val pieSet = PieDataSet(list,"debtors")
        pieSet.colors = ColorTemplate.COLORFUL_COLORS.toList()
        pieSet.valueTextSize = 16f
        pieSet.valueTextColor = R.color.black
        val pieData = PieData(pieSet)
        binding.apply {
            pieChart.data = pieData
            pieChart.animate()
            pieChart.centerText = "Debtors"
            pieChart.setCenterTextSize(25f)
            pieChart.description.isEnabled = false
        }
    }
}