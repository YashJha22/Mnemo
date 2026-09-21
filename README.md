# Mnemo

Mnemo is a spaced-repetition learning app for creating flashcards, reviewing them at the right time, and tracking learning progress.

I'm building Mnemo as a practical Android project to understand how a real application is structured, from local persistence and state management to the UI and the learning logic behind it.

## What I'm Building

The core idea is simple: instead of reviewing every card repeatedly, Mnemo uses spaced repetition to bring cards back when they are most useful to review.

Planned features include:

- Create and manage decks
- Create, edit, and delete flashcards
- Spaced-repetition based study sessions
- Due-today review queue
- Rate cards after reviewing them
- Learning statistics and streaks
- Offline-first local storage
- Clear separation between UI, business logic, and data

## Tech Stack

- Kotlin
- Jetpack Compose
- MVVM
- ViewModel
- StateFlow
- Room
- Kotlin Coroutines
- Navigation Compose

## Architecture

Mnemo follows a layered architecture:

Compose UI
↓
ViewModel
↓
Repository
↓
Room DAO
↓
SQLite Database

The UI observes state from the ViewModel, while the Repository handles access to the local data layer.

The goal is to keep UI code separate from application logic and database operations as the project grows.

## Current Progress

Mnemo is actively under development.

### Completed

- [x] Android project setup
- [x] Jetpack Compose foundation
- [x] Room database setup
- [x] Deck entity
- [x] Deck DAO
- [x] Database configuration
- [x] Repository layer
- [x] Deck ViewModel
- [x] Basic deck CRUD workflows

### In Progress / Planned

- [ ] Deck UI
- [ ] Flashcard entity
- [ ] Flashcard CRUD
- [ ] Study session
- [ ] Spaced-repetition algorithm
- [ ] Due-card queue
- [ ] Card review and rating
- [ ] Statistics
- [ ] Streak tracking
- [ ] UI polish
- [ ] Testing

## Project Structure

The project is organized around the responsibilities of each layer rather than putting application logic directly inside the UI.

UI
→ Compose screens
→ ViewModel
→ UI state and user actions
→ Repository
→ Data operations
→ Room
→ DAO, Entities, and Database

As the project grows, the structure will evolve with it.

## Why Mnemo?

Mnemo is more than a UI project.

I'm using it to learn how the different parts of a modern Android application work together in a complete product — from local persistence and state management to application architecture and the actual learning logic behind spaced repetition.

The goal is to build the application incrementally and understand each part instead of treating the project as a collection of copied code.

## Development Approach

The project is being built feature by feature.

Each major piece of functionality is implemented and committed as the application evolves. This keeps the development history tied to the actual progression of the project.

## Status

**In active development**

Mnemo is currently focused on the core architecture and deck management functionality. More features will be added as development continues.
