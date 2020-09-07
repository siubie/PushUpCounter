package id.putraprima.pushupcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class PushUpActivity : AppCompatActivity() {
    var counter:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_push_up)
        val container = findViewById<ConstraintLayout>(R.id.container_pushup_counter)
        val textCounter=findViewById<TextView>(R.id.text_pushup_count)
        textCounter.text = "0"
        container.setOnClickListener {
            counter += 1
            textCounter.text = counter.toString()
        }

    }

}