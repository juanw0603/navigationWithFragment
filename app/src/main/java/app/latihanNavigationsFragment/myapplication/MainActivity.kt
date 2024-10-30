package app.latihanNavigationsFragment.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mFragmentManager = supportFragmentManager
        val Fhalaman1 = halaman1()


        val _navToHalaman1 = findViewById<Button>(R.id.halaman1)

        _navToHalaman1.setOnClickListener {
            mFragmentManager.findFragmentByTag(halaman1::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .replace(R.id.FragmentPlace, Fhalaman1,halaman1::class.java.simpleName)
                .commit()
        }

    }
}