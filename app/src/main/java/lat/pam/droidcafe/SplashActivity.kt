package lat.pam.droidcafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    val signInButton: Button = findViewById(R.id.signInButton)
    val logInButton: Button = findViewById(R.id.logInButton)

    // Assuming you have a LoginActivity
    val intent = Intent(this, LoginActivity::class.java)

    signInButton.setOnClickListener {
        // You can add extra data to differentiate if needed
        intent.putExtra("ACTION", "SIGN_IN")
        startActivity(intent)
    }

    logInButton.setOnClickListener {
        intent.putExtra("ACTION", "LOG_IN")
        startActivity(intent)
    }
}
}
