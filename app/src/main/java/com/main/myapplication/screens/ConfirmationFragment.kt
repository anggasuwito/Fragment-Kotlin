package com.main.myapplication.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.main.myapplication.R
import com.main.myapplication.TransactionActivity
import kotlinx.android.synthetic.main.fragment_confirmation.*
import kotlinx.android.synthetic.main.fragment_input_amount.*


class ConfirmationFragment : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_confirmation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments!!.getString("name")
        val bankName = arguments!!.getString("bankName")
        val accounNumber = arguments!!.getString("accountNumber")
        val amount = arguments!!.getString("amount")
        bankNameConfirmation.text = "Bank : $bankName"
        nameConfirmation.text = "Name : $name"
        accounNumberConfirmation.text = "Account Number : $accounNumber"
        amountConfirmation.text = "Amount : Rp.$amount"
        doneButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            doneButton -> {
                activity?.finish()
            }
        }
    }
}