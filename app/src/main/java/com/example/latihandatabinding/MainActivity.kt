package com.example.latihandatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihandatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        productAdapter = ProductAdapter(arrayListOf(
            DataProduk("Ekonomi", "59000", "5", R.drawable.img_sabun_colek),
            DataProduk("Sunlight", "59000", "5", R.drawable.img_sunlight),
            DataProduk("SOS", "59000", "5", R.drawable.img_sos),
            DataProduk("Mama Lemon", "59000", "5", R.drawable.img_mama_lemon),
            DataProduk("Sahaja", "59000", "5", R.drawable.img_sahaja),
            DataProduk("Sabun Colek", "59000", "5", R.drawable.img_sabun_colek)
        ))

        binding.rvProduct.adapter = productAdapter
        binding.rvProduct.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}