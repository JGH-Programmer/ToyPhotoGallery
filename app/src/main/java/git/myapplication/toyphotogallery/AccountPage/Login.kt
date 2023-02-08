package git.myapplication.toyphotogallery.AccountPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import git.myapplication.toyphotogallery.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}