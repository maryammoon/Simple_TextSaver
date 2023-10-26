package ir.dunijet.textsaver

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ir.dunijet.textsaver.databinding.FragmentSplashBinding

class Splash_Fragment : Fragment() {
     lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(layoutInflater)
        val view = (binding.root)

        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splash_Fragment_to_register_Fragment)
            binding.lottieSplashScreen.playAnimation()
        }, 3000)
        return view
    }
}