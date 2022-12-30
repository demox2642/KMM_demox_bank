package org.example.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import navigation.setupThemedNavigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupThemedNavigation()
    }
}
