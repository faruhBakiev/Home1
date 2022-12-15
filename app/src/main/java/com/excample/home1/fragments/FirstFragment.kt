package com.excample.home1.fragments

import SecondAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ConcatAdapter
import com.excample.home1.adapters.FirstAdapter
import com.excample.home1.databinding.FragmentFirstBinding
import com.excample.home1.model.MainModel
import com.excample.home1.repository.RecyclerRepository

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null
    private var adapterFirst: FirstAdapter? = null
    private var adapterSecond: SecondAdapter? = null
    private val repository = RecyclerRepository()
    private var mainList: ArrayList<MainModel>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        mainList = repository.getListModelData()
        adapterFirst = FirstAdapter(mainList as ArrayList<MainModel>, this::onClickListener)
        adapterSecond = SecondAdapter(mainList as ArrayList<MainModel>, this::onClickListenerImage)
        val concatAdapter = ConcatAdapter(adapterFirst, adapterSecond)
        binding?.rvFirst?.adapter = concatAdapter
    }

    private fun onClickListenerImage(mainModel: MainModel) {
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToSecondFragment(mainModel.image)
        )
    }


    private fun onClickListener(mainModel: MainModel) {
        findNavController().navigate(
            FirstFragmentDirections.actionMainFragmentToDetailFragment(mainModel.name)
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mainList?.clear()
        binding = null
    }
}
