package com.example.foreducationhilt.sheet

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

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