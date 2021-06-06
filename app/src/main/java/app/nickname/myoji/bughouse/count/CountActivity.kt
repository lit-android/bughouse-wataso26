package app.nickname.myoji.bughouse.count

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.nickname.myoji.bughouse.R

class CountActivity : AppCompatActivity() {
    val number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                                                                                                                                        setContentView(R.layout.activity_count)

        val button: Button = findViewById(R.id.botton)
        val textView: TextView = findViewById(R.id.text_view)

        button.setOnClickListener {
            number　+=　1
            textView.text=number
        }


