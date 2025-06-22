package com.example.foreducationhilt

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foreducationhilt.sheet.DocumentSheet
import com.example.foreducationhilt.sheet.ExcelSheet
import com.example.foreducationhilt.sheet.factory.DocumentSheetFactory
import com.example.foreducationhilt.sheet.theme.ThemeA
import com.example.foreducationhilt.sheet.theme.ThemeB
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.example.foreducationhilt.sheet.Sheet
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject 
    @Named("document")
    lateinit var documentSheet: Sheet
    
    @Inject 
    @Named("excel")
    lateinit var excelSheet: Sheet
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d(TAG, "문서 시트 제목: ${documentSheet.title}, 테마: ${documentSheet.theme.name}")
        Log.d(TAG, "엑셀 시트 제목: ${excelSheet.title}, 테마: ${excelSheet.theme.name}")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}