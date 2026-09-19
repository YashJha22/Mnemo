package com.mnemo.app.data.local

class DeckRepository (

        private val deckDao: DeckDao
){

    fun getdecks() = deckDao.getAllDecks()

    suspend fun addDeck(deck: Deck){
        deckDao.insertDeck(deck)
    }

    suspend fun deleteDeck(deck: Deck){
        deckDao.deleteDeck(deck)
    }

}
