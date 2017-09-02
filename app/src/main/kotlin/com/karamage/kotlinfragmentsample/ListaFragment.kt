package com.karamage.kotlinfragmentsample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by masaakikakimoto on 2017/08/31.
 */
class ListaFragment : Fragment() {
    companion object {
        fun getInstance(): ListaFragment {
            return ListaFragment()
        }
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater?.inflate(R.layout.fragment_lista, container, false)
}