package git.myapplication.toyphotogallery.AccountPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import git.myapplication.toyphotogallery.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}