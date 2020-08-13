package com.main.myapplication.screens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.myapplication.R
import kotlinx.android.synthetic.main.fragment_input_amount.*

class InputAmountFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController
    lateinit var bundle: Bundle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_amount, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val name = arguments!!.getString("name")
        val bankName = arguments!!.getString("bankName")
        val accounNumber = arguments!!.getString("accountNumber")
        recipientName.text =
            "To : \nbank name : $bankName \naccount number : $accounNumber \nname : $name"
        sendButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            sendButton -> {
                bundle = bundleOf(
                    "name" to arguments!!.getString("name"),
                    "bankName" to arguments!!.getString("bankName"),
                    "accountNumber" to arguments!!.getString("accountNumber"),
                    "amount" to recipient_amount_text.text.toString()
                )
                navController.navigate(R.id.action_inputAmountFragment_to_confirmationFragment2,bundle)
            }
        }
    }

}