package ir.dunijet.textsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.dunijet.textsaver.databinding.FragmentContainerBinding

class container : Fragment() {
    lateinit var binding :FragmentContainerBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentContainerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstRun()
        binding.buttomNavigationMain.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_register->{
                    replaceFragment(Register_Fragment())
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

    private fun firstRun() {
        replaceFragment(Register_Fragment())
        binding.buttomNavigationMain.selectedItemId =R.id.menu_register

    }


    private fun replaceFragment(fragment: Fragment){
        val transaction =activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frame_main_container ,fragment)
        transaction?.commit()
    }

    }
