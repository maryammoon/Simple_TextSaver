package ir.dunijet.textsaver

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.dunijet.textsaver.databinding.ActivityMainBinding
import ir.dunijet.textsaver.databinding.DialogeProfileImgBinding
import ir.dunijet.textsaver.databinding.FragmentProfileBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private lateinit var binding1: FragmentProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding1 = FragmentProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)



}}