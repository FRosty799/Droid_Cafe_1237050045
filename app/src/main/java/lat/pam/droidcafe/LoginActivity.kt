package lat.pam.droidcafe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find views from the layout
        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)
        val registerButton: Button = findViewById(R.id.registerButton)

        // Set click listener for the Login button
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Basic validation
            if (email.isNotEmpty() && password.isNotEmpty()) {
                // For now, we'll just show a success message and go to MainActivity
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

                // Navigate to the main part of the app
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finish LoginActivity so the user can't go back to it
            } else {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            }
        }

        // Set click listener for the Register button
        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // In a real app, you would save this to a database
                Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()

                // For simplicity, we'll also navigate to MainActivity after registration
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finish LoginActivity
            } else {
                Toast.makeText(this, "Please fill in all fields to register.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
