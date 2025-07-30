# 🧵 StitchCraft Pro – Tailors App

StitchCraft Pro is an Android application designed to modernize the tailoring experience for both Admins (Tailors) and Customers. It offers robust inventory management, virtual previews, real-time shop discovery, and a seamless shopping cart system — all built with Firebase integration and XML-based UI for maximum performance and user experience.

📱 Features
👤 Admin Module
✅ Login and register with secure Firebase Auth

🧾 Add, update, search, and delete inventory items

📦 Manage materials and categories

📊 Dashboard with quick access to key tools

🛍️ Customer Module
✅ Customer authentication and profile management

🧵 Browse available tailoring materials by category

🔍 Search nearby tailor shops using Google Places API

🧺 Add items to cart with quantity selection and live price calculation

🧑‍🎨 View material details with realistic stitched previews

🛠️ Tech Stack
Language: Java + XML (Android)

Backend: Firebase Authentication & Firestore Database

APIs: Google Places API (for nearby shop search)

Architecture: MVVM

UI: XML-based with modern Android design principles

Tools: Android Studio, Git, Firebase Console

📂 Project Structure
markdown
Copy
Edit
├── activities/
│   ├── AdminDashboardActivity.java
│   ├── CustomerDashboardActivity.java
│   ├── MaterialDetailActivity.java
│   └── ...
├── viewmodel/
│   ├── AdminViewModel.java
│   ├── CustomerViewModel.java
│   └── ...
├── models/
│   ├── MaterialItem.java
│   ├── CartItem.java
│   └── ...
├── adapters/
│   ├── MaterialAdapter.java
│   ├── CartAdapter.java
│   └── ...
└── xml/
    ├── activity_login.xml
    ├── activity_cart.xml
    └── ...

🔐 Firebase Collections Used
admin_inventory_item

customer_inventory_item

customer_cart

users

categories

📃 License
This project is licensed under the MIT License.

