package com.mnemo.app.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Deck::class], version =1, exportSchema = false)
abstract class MnemoDatabase: RoomDatabase(){

    abstract fun deckDao (): DeckDao

    companion object {
        @Volatile
        private var INSTANCE: MnemoDatabase? = null

        fun getDatabase(context: Context): MnemoDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MnemoDatabase::class.java,
                    "mnemo_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

