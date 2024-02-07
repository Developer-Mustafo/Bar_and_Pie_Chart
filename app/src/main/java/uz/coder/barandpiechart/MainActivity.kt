package uz.coder.barandpiechart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.coder.barandpiechart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply{
            bar.setOnClickListener {
                startActivity(Intent(applicationContext,BarActivity::class.java))
            }
            pie.setOnClickListener {
                startActivity(Intent(applicationContext,PieActivity::class.java))
            }
        }
    }
}