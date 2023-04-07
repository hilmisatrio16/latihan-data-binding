package com.example.latihandatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihandatabinding.databinding.ItemListProdukBinding

class ProductAdapter(private var listProduk : ArrayList<DataProduk>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(var binding : ItemListProdukBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindProduct(itemData : DataProduk){
            binding.product = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        val view = ItemListProdukBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        //var dataProduk = listProduk[position]
        holder.bindProduct(listProduk[position])
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }
}