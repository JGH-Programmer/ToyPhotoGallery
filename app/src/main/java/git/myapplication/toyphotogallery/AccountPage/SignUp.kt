package git.myapplication.toyphotogallery.AccountPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import git.myapplication.toyphotogallery.DBHelper
import git.myapplication.toyphotogallery.MainActivity
import git.myapplication.toyphotogallery.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.SignActivityLoginButton.setOnClickListener {
            val unametext = binding.SignActivityAccountEditText.text.toString()
            val pwordtext = binding.SignActivityPasswordEditText.text.toString()
            val cpwordtext = binding.SignActivityConformPasswordEditText.text.toString()
            val saveData = DBHelper(this).insertdata(unametext, pwordtext)

            if (TextUtils.isEmpty(unametext) || TextUtils.isEmpty(pwordtext) || TextUtils.isEmpty(
                    cpwordtext
                )
            ) {
                Toast.makeText(
                    this,
                    "Add Username, Password & Conform Password",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                if (pwordtext.equals(cpwordtext)) {
                    if (saveData == true) {
                        Toast.makeText(this, "SignUp Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "User Exists", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Password Not Match", Toast.LENGTH_SHORT).show()
                }


            }
        }

    }


}
