package git.myapplication.toyphotogallery.AccountPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import git.myapplication.toyphotogallery.DBHelper
import git.myapplication.toyphotogallery.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.LoginActivityLoginButton.setOnClickListener {
            val usertx = binding.LoginActivityAccountEditText.text.toString()
            val passwordtx = binding.LoginActivityPasswordEditText.text.toString()

            if (TextUtils.isEmpty(usertx) || TextUtils.isEmpty(passwordtx)) {
                Toast.makeText(this, "Add Acount & Password ", Toast.LENGTH_SHORT).show()
            } else {
                val checkuser = DBHelper(this).checkuserpass(usertx, passwordtx)
                if (checkuser == true) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    //intent Activity
                } else {
                    Toast.makeText(this, "Wrong Username & Password", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }
}