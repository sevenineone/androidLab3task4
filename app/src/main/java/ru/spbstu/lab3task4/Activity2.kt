package ru.spbstu.lab3task4


import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import ru.spbstu.lab3task4.databinding.Activity2Binding
import android.view.Menu


class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        binding.toFirst.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java)
                .setFlags(FLAG_ACTIVITY_CLEAR_TOP))
        }
        binding.toThird.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.activity_about -> {
                startActivity(Intent(this, ActivityAbout::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}