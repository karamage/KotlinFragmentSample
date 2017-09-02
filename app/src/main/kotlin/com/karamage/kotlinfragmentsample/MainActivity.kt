package com.karamage.kotlinfragmentsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.karamage.kotlinfragmentsample.ListaFragment

class MainActivity : AppCompatActivity() {
    private var listaFragment: ListaFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            listaFragment = ListaFragment.getInstance()
            supportFragmentManager?.beginTransaction()?.replace(R.id.flLista, listaFragment)?.commit()
        }
    }
}
