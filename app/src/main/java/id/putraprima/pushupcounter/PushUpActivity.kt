package id.putraprima.pushupcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import id.putraprima.pushupcounter.databinding.ActivityPushUpBinding

class PushUpActivity : AppCompatActivity() {
    private var counter: Int = 0;
    lateinit var binding: ActivityPushUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_push_up)
        binding.apply {
           textPushupCount.text = "0"
            containerPushupCounter.setOnClickListener {
                counter +=1
                textPushupCount.text = counter.toString()
            }
        }
    }

}