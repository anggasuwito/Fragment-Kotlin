package com.main.myapplication.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.myapplication.R
import kotlinx.android.synthetic.main.fragment_home_fragmet.*


class HomeFragmet : Fragment(), View.OnClickListener {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragmet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        transaction_history_button.setOnClickListener(this)
        balance_button.setOnClickListener(this)
        transfer_button.setOnClickListener(this)
        shareButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            //diisi dengan id action
            transfer_button -> {
                navController.navigate(R.id.action_homeFragmet_to_transactionActivity)
            }
            balance_button -> {
                navController.navigate(R.id.action_homeFragmet_to_balanceFragment)
            }
            transaction_history_button -> {
                navController.navigate(R.id.action_homeFragmet_to_historyFragment)
            }
            shareButton->{
                val share = Intent(Intent.ACTION_SEND)
                share.type = "text/plain"
                share.putExtra(Intent.EXTRA_SUBJECT,"My Wallet")
                share.putExtra(Intent.EXTRA_TEXT,"http://www.facebook.com")
                startActivity(Intent.createChooser(share,"Share Link !!!"))
            }
        }
    }
}