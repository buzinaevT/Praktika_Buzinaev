package com.example.praktika_buzinaev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    private fun init()
    {
        var toogle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.id_my_ads -> {
                Toast.makeText(this, "pressed id_my_ads", Toast.LENGTH_LONG).show()
            }
            R.id.id_cars -> {
                Toast.makeText(this, "pressed id_cars", Toast.LENGTH_LONG).show()
            }
            R.id.id_pc -> {
                Toast.makeText(this, "pressed id_pc", Toast.LENGTH_LONG).show()
            }
            R.id.id_smartphone -> {
                Toast.makeText(this, "pressed id_smartphone", Toast.LENGTH_LONG).show()
            }
            R.id.id_dm -> {
                Toast.makeText(this, "pressed id_dm", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_up -> {
                Toast.makeText(this, "pressed id_sign_up", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_in -> {
                Toast.makeText(this, "pressed id_sign_in", Toast.LENGTH_LONG).show()
            }
            R.id.id_sign_out -> {
                Toast.makeText(this, "pressed id_sign_out", Toast.LENGTH_LONG).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}