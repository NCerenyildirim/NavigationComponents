package com.example.warningscreensfragmentstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.warningscreensfragmentstudy.databinding.FragmentNoFavouritesBinding




class NoFavouritesFr : Fragment() {
    private lateinit var fragmentNoFavouritesBinding: FragmentNoFavouritesBinding
    private lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fragmentNoFavouritesBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_no_favourites, container, false)
            return fragmentNoFavouritesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoFavouritesBinding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_noFavouritesFr_to_no_notification2)


        }


    }

}


