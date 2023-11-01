package ir.dunijet.textsaver

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import ir.dunijet.textsaver.databinding.DialogeProfileImgBinding
import ir.dunijet.textsaver.databinding.FragmentProfileBinding

@Suppress("UNREACHABLE_CODE")
class Profile_Fragment : Fragment() {

    lateinit var binding :FragmentProfileBinding
    lateinit var preferences :SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return (binding.root)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgProfile.setOnClickListener(){

            val dialog = AlertDialog.Builder(getActivity()).create()

            val dialogBinding = DialogeProfileImgBinding.inflate(layoutInflater)
            dialog.setView(dialogBinding.root)
            dialog.setCancelable(true)
            dialog.show()

            dialogBinding.imgProfile1.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile3)
            }
            dialogBinding.imgProfile2.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile2)
            }
            dialogBinding.imgProfile3.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile8)
            }
            dialogBinding.imgProfile4.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile9)
            }
            dialogBinding.imgProfile5.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile5)
            }
            dialogBinding.imgProfile6.setOnClickListener{
                dialog.dismiss()
                binding.imgProfile.setImageResource(R.drawable.img_profile6)
            }
                }


        preferences = requireActivity().getSharedPreferences("dataa" ,Context.MODE_PRIVATE )

        preferences = requireActivity().getSharedPreferences("data" ,Context.MODE_PRIVATE )
        val name= preferences.getString("name", "")
        val email = preferences.getString("email", "")
        val password = preferences.getString("password", "")


        binding.nameProf.text = name
        binding.emailP.text = email





        binding.btnTaidBio.setOnClickListener {
            val text = binding.editText.text.toString()

                val editor = preferences.edit()
                editor.putString("text", text)
                editor.apply()

            val textt = preferences.getString("text", "")
            binding.editText.setText(textt)

            Toast.makeText(activity, "saved", Toast.LENGTH_SHORT).show()


    }


    }
        }



