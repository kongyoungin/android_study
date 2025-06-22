package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.Theme
import com.example.foreducationhilt.sheet.theme.ThemeA
import com.example.foreducationhilt.sheet.theme.ThemeB
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton
import dagger.Provides

@Module
@InstallIn(SingletonComponent::class)
abstract class SheetModule {
    @Binds
    @Singleton
    @Named("document")
    abstract fun bindDocumentSheet(documentSheet: DocumentSheet): Sheet
    
    @Binds
    @Singleton
    @Named("excel")
    abstract fun bindExcelSheet(excelSheet: ExcelSheet): Sheet
}

@Module
@InstallIn(SingletonComponent::class)
object ThemeProvidesModule {
    @Provides
    @Singleton
    @Named("themeA")
    fun provideThemeA(): Theme = ThemeA()

    @Provides
    @Singleton
    @Named("themeB")
    fun provideThemeB(): Theme = ThemeB()
} 