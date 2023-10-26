package ir.dunijet.textsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.dunijet.textsaver.databinding.FragmentRegisterBinding

class Register_Fragment : Fragment() {
    lateinit var binding:FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttomNavigationMain.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_register->{
                    replaceFragment(Profile_Fragment())
                }
                R.id.menu_profile->{
                    replaceFragment(Profile_Fragment())
                }
                R.id.menu_home->{
                    replaceFragment(Home_Fragment())
                }
            }
            true
        }
        binding.buttomNavigationMain.setOnItemReselectedListener{}

    }

    private fun replaceFragment(fragment: Fragment){
        val transaction =activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frame_main_container ,fragment)
        transaction?.commit()
    }
}