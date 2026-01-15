package lat.pam.droidcafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OrderConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirmation)

        val goHomeButton: Button = findViewById(R.id.go_home_button)

        goHomeButton.setOnClickListener {
            // Create an Intent to go back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            // Add flags to clear the activity stack
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // Finish this activity
        }
    }
}
