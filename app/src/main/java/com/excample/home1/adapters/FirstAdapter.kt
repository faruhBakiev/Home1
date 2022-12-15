package com.excample.home1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.excample.home1.databinding.ItemFirstBinding
import com.excample.home1.model.MainModel

class FirstAdapter(
    private var List: ArrayList<MainModel>,
    private val onClickListener: (name: MainModel) -> Unit
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private val binding: ItemFirstBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                onClickListener(List[bindingAdapterPosition])
            }
        }

        fun onBind(mainModel: MainModel) {
            binding.tvName.text = mainModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val binding = ItemFirstBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FirstViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(List[position])
    }

    override fun getItemCount(): Int {
        return List.size
    }
}