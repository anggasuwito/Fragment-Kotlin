package com.main.myapplication.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.myapplication.R
import kotlinx.android.synthetic.main.fragment_input_recipient.*

class InputRecipientFragment : Fragment(), View.OnClickListener {
    lateinit var navController: NavController
    lateinit var bundle: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onClick(v: View?) {

        when (v) {
            nextTransaction -> {
                bundle = bundleOf(
                    "name" to recipient_name_text.text.toString(),
                    "accountNumber" to recipient_account_text.text.toString(),
                    "bankName" to bankName.selectedItem.toString()
                )
                navController.navigate(
                    R.id.action_inputRecipientFragment2_to_inputAmountFragment,
                    bundle
                )
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        nextTransaction.setOnClickListener(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_recipient, container, false)
    }


}