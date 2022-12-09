package com.example.studenthardlife

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentViewItems : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_view_items, container, false)

        view.findViewById<FloatingActionButton>(R.id.ItemsView).setOnClickListener {
            val action = FragmentViewItemsDirections.actionFragmentViewItemsToFragmentDetailedView2()
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }
}