package com.example.warningscreensfragmentstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.warningscreensfragmentstudy.databinding.FragmentNoFavouritesBinding


class NoNotification : Fragment() {
    private lateinit var fragmentNoFavouritesBinding: FragmentNoFavouritesBinding
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_no_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentNoFavouritesBinding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_noFavouritesFr_to_no_notification2)

        }
    }
}