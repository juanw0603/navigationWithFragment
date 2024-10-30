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
        val Fhalaman2 = halaman2()
        val Fhalaman3 = halaman3()

        val _navToHalaman1 = findViewById<Button>(R.id.halaman1)
        val _navToHalaman2 = findViewById<Button>(R.id.halaman2)
        val _navToHalaman3 = findViewById<Button>(R.id.halaman3)

        _navToHalaman1.setOnClickListener {
            mFragmentManager.findFragmentByTag(halaman1::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .replace(R.id.FragmentPlace, Fhalaman1,halaman1::class.java.simpleName)
                .commit()
        }

        _navToHalaman2.setOnClickListener {
            mFragmentManager.findFragmentByTag(halaman2::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .replace(R.id.FragmentPlace, Fhalaman2,halaman2::class.java.simpleName)
                .commit()
        }


    }
}