package com.example.myapk

class BookService {

    fun getBooks(): List<Book> {
        return listOf(
            Book("Le Petit Prince", "Antoine de Saint-Exupéry"),
            Book("1984", "George Orwell"),
            Book("L'Étranger", "Albert Camus"),
            Book("Les Misérables", "Victor Hugo")
        )
    }
}
