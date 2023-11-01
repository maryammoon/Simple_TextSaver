package ir.dunijet.textsaver

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import ir.dunijet.textsaver.databinding.FragmentRegisterBinding


class Register_Fragment : Fragment() {
    lateinit var binding: FragmentRegisterBinding
    lateinit var preferences: SharedPreferences
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

        preferences = requireActivity().getSharedPreferences("data" ,Context.MODE_PRIVATE )

        binding.btnRegister.setOnClickListener {
            val name = binding.edtName.text.toString()
            val email = binding.edtEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                val editor = preferences.edit()
                editor.putString("name", name)
                editor.putString("email", email)
                editor.putString("password", password)
                editor.apply()

            }else{
                Toast.makeText(activity, "لطفا تمام مقادیر را وارد کنید", Toast.LENGTH_SHORT).show()

            }
            Toast.makeText(activity, "your information saved", Toast.LENGTH_SHORT).show()
        }
            val name= preferences.getString("name", "")
            val email = preferences.getString("email", "")
            val password = preferences.getString("password", "")


        binding.edtName.setText(name)
        binding.edtEmail.setText(email)
            binding.editTextPassword.setText(password)



            }
}
