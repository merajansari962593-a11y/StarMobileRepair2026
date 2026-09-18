package com.starmobile

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(12, 12, 18))
        layout.setPadding(24, 24, 24, 24)

        val title = TextView(this)
        title.text = "⭐ STAR MOBILE REPAIR"
        title.textSize = 28f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Mobile Repairing • Service • Support"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 20, 0, 0)

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
