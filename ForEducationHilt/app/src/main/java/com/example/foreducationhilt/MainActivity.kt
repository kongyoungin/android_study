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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val themeA = ThemeA()
        val themeB = ThemeB()

        val documentSheetFactory = DocumentSheetFactory()
        val documentSheet = documentSheetFactory.create("문서1", themeA)
        val excelSheet = ExcelSheet("엑셀1", themeB)

        Log.d(TAG, "문서 시트 제목: ${documentSheet.title}, 테마: ${documentSheet.theme.name}")
        Log.d(TAG, "엑셀 시트 제목: ${excelSheet.title}, 테마: ${excelSheet.theme.name}")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}