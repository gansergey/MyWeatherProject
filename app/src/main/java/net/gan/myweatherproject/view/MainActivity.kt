package net.gan.myweatherproject.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import net.gan.myweatherproject.R
import net.gan.myweatherproject.databinding.MainActivityBinding
import net.gan.myweatherproject.view.main.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}