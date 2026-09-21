# Mnemo

Mnemo is a spaced-repetition learning app for creating flashcards, reviewing them at the right time, and keeping track of learning progress.

I'm building Mnemo as a practical Android project while learning how to structure a real application with modern Android development tools and patterns.

## What I'm Building

The core idea is simple: instead of reviewing everything repeatedly, Mnemo uses spaced repetition to bring cards back when you're most likely to need them.

Planned features include:

- Create and manage decks
- Create, edit, and delete flashcards
- Spaced-repetition based study sessions
- Due-today review queue
- Rate cards after reviewing them
- Learning statistics and streaks
- Offline-first local storage
- Clean separation between UI, business logic, and data

## Tech Stack

- **Kotlin**
- **Jetpack Compose** — UI
- **MVVM** — application architecture
- **ViewModel** — UI state and business logic
- **StateFlow** — reactive state management
- **Room** — local database
- **Coroutines** — asynchronous operations
- **Navigation Compose** — screen navigation

## Architecture

Mnemo follows a layered approach:

```text
Compose UI
    ↓
ViewModel
    ↓
Repository
    ↓
Room DAO
    ↓
SQLite Database
