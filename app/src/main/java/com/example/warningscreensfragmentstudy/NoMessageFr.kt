package com.example.warningscreensfragmentstudy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.warningscreensfragmentstudy.databinding.FragmentNoMessageBinding


class NoMessageFr : Fragment() {

    private lateinit var fragmentNoMessageFrBinding: FragmentNoMessageBinding
    private lateinit var button: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        fragmentNoMessageFrBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_no_message, container, false)
        return fragmentNoMessageFrBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fragmentNoMessageFrBinding.button.setOnClickListener{
            findNavController().navigate(R.id.action_noMessageFr_to_noFavouritesFr)
        }

    }


    }

