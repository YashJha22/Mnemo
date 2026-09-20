        package com.mnemo.app.ui

        import androidx.lifecycle.ViewModel
        import androidx.lifecycle.viewModelScope
        import com.mnemo.app.data.local.Deck
        import com.mnemo.app.data.local.DeckRepository
        import kotlinx.coroutines.flow.MutableStateFlow
        import kotlinx.coroutines.flow.StateFlow
        import kotlinx.coroutines.flow.asStateFlow
        import kotlinx.coroutines.launch

        class DeckViewModel (private val repository: DeckRepository) : ViewModel() {

            private val _uiState = MutableStateFlow<List<Deck>>(emptyList())
            val uiState: StateFlow<List<Deck>> = _uiState.asStateFlow()

            fun loadDeck() {
                viewModelScope.launch {
                    repository.getdecks().collect { decks ->
                        _uiState.value = decks
                    }
                }
            }

            fun addDeck(title: String) {
                if (title.isBlank()) return
                viewModelScope.launch {
                    val newDeck = Deck(name = title)
                    repository.addDeck(newDeck)
                }
            }

            fun deleteDeck(deck: Deck) {
                viewModelScope.launch {
                    repository.deleteDeck(deck)
                }
            }
        }
