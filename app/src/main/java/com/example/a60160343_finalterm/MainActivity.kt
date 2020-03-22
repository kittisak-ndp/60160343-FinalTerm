package com.example.a60160343_finalterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_RecyclerView = recycler_view()
        val manager = supportFragmentManager;
        val transaction = manager.beginTransaction();
        transaction.replace(R.id.layout, fragment_RecyclerView,"fragment_RecyclerView")
        transaction.addToBackStack("fragment_RecyclerView")
        transaction.commit();

    }

}
