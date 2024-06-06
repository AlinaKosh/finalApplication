package com.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Adapters.NotificationAdapter
import com.example.Models.NotificationModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNotificationBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class NotificationBottomFragment : BottomSheetDialogFragment() {


    private lateinit var binding: FragmentNotificationBottomBinding
    private lateinit var notificationList: ArrayList<NotificationModel>
    private lateinit var adapter: NotificationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNotificationBottomBinding.inflate(inflater, container, false)

        notificationList = ArrayList()
        notificationList.add(NotificationModel(R.drawable.n_unsuccess, "Ваш заказ успешно отменен"))
        notificationList.add(NotificationModel(R.drawable.n_deliver, "Заказ принят водителем"))
        notificationList.add(NotificationModel(R.drawable.n_success, "Поздравляем, ваш заказ размещен"))




        binding.btnBack.setOnClickListener {
            dismiss()
        }

        adapter = NotificationAdapter(requireContext(), notificationList as ArrayList<NotificationModel>)

        binding.noteRv.layoutManager = LinearLayoutManager(requireContext())
        binding.noteRv.adapter = adapter
        return binding.root
    }


}