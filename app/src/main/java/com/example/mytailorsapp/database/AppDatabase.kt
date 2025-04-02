package com.example.mytailorsapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mytailorsapp.data.CustomerDao
import com.example.mytailorsapp.data.WorkerDao
import com.example.mytailorsapp.data.AdminDao
import com.example.mytailorsapp.data.InventoryDao
import com.example.mytailorsapp.data.MaterialDao

@Database(entities = [AdminEntity::class, CustomerEntity::class, WorkerEntity::class, InventoryItem::class, MaterialItem::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun customerDao(): CustomerDao
    abstract fun adminDao(): AdminDao
    abstract fun workerDao(): WorkerDao
    abstract fun inventoryDao(): InventoryDao
    abstract fun materialDao(): MaterialDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "tailors_app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
