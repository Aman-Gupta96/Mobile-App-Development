package com.example.bloodmanagementsystem

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bloodmanagementsystem.ui.theme.BloodManagementSystemTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDonorRegistration = findViewById<Button>(R.id.btnDonorRegistration)
        btnDonorRegistration.setOnClickListener {
            // Intent to open DonorRegistrationActivity
        }

        val btnRequestBlood = findViewById<Button>(R.id.btnRequestBlood)
        btnRequestBlood.setOnClickListener {
            // Intent to open RequestBloodActivity
        }

        val btnManageInventory = findViewById<Button>(R.id.btnManageInventory)
        btnManageInventory.setOnClickListener {
            // Intent to open ManageInventoryActivity
        }
    }
}