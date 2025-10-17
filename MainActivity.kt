package com.example.myapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Injection automatique du service par Hilt
    @Inject
    lateinit var bookService: BookService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupération des livres depuis le service injecté
        val books = bookService.getBooks()

        // Affichage des livres
        displayBooks(books)
    }

    private fun displayBooks(books: List<Book>) {
        val textView = findViewById<TextView>(R.id.textViewBooks)
        val text = books.joinToString(separator = "\n\n") {
            "📘 ${it.title}\n👤 ${it.author}"
        }
        textView.text = text
    }
}
