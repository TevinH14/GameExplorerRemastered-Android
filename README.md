# 🎮 Game Explorer Remastered (Android)

Game Explorer Remastered is a modern Android application built with **Kotlin** and **Jetpack Compose** that allows users to explore video games using the **RAWG Video Games Database API**. The app focuses on clean architecture, modern Android best practices, and scalability.

This project is designed as a **portfolio-grade Android app** showcasing mid-to-senior Android development skills.

---

## Features

* 🔍 Browse popular and trending games
* 📄 View detailed game information (description, ratings, platforms, genres)
* 🖼️ Display game screenshots and cover art
* ⚡ Fast, reactive UI with Jetpack Compose
* 🌐 Remote data loading using Retrofit + Coroutines
* 🧠 MVVM architecture with unidirectional data flow
* 🧪 Easily testable layers (UI, ViewModel, Repository)

---

## Tech Stack

### Android

* **Kotlin**
* **Jetpack Compose** (UI)
* **Material 3**
* **Navigation Compose**
* **ViewModel**
* **Kotlin Coroutines & Flow**

### Networking

* **Retrofit**
* **OkHttp**
* **Gson / Moshi** (JSON parsing)

### Architecture

* **MVVM (Model–View–ViewModel)**
* **Repository Pattern**
* **Single Source of Truth**

---

## 📂 Project Structure

```text
app/
├── manifests/
│ └── AndroidManifest.xml
│
├── kotlin+java/
│ └── com.example.gameexplorerremastered_android/
│ ├── core/
│ │ └── MainActivity.kt # App entry point
│ │
│ ├── features/
│ │ ├── games/
│ │ │ ├── model/         # RAWG API Game data models
│ │ │ │ ├── Game.kt
│ │ │ │ ├── Genre.kt
│ │ │ │ ├── Platform.kt
│ │ │ │ ├── Rating.kt
│ │ │ │ ├── EsrbRating.kt
│ │ │ │ ├── RawgResponse.kt
│ │ │ │ ├── ScreenShot.kt
│ │ │ │ └── (other API models)
│ │ │ ├── viewModels/
│ │ │ │ └── GamesViewModel.kt
│ │ │ └── views/
│ │ │ ├── gameCarouselViews/
│ │ │ │ ├── GameCard.kt
│ │ │ │ └── GameCarousel.kt
│ │ │ └── GameView.kt
│ │ │
│ │ └── home/.               # first view loaded into
│ │ ├── viewModels/
│ │ │ └── HomeViewModel.kt
│ │ └── views/
│ │ └── HomeView.kt
│ │
│ ├── settings/.             # User Settings 
│ │ ├── views/
│ │ │ └── SettingsView.kt
│ │ └── viewModel/
│ │ └── SettingsViewModel.kt
│ │
│ ├── navigation/
│ │ ├── AppNavHost.kt # Navigation graph
│ │ ├── DrawerApp.kt # App drawer scaffold
│ │ ├── DrawerContent.kt
│ │ └── Screen.kt # Screen routes
│ │
│ ├── components/.             # resuable views 
│ │ ├── buttonsComponents/
│ │ │ └── GameButton.kt
│ │ ├── cardsComponents/
│ │ │ └── DisplayCardView.kt
│ │ ├── imagesComponents/
│ │ │ └── DisplayImage.kt
│ │ └── textComponent/
│ │ ├── GameText.kt
│ │ ├── GameFont.kt
│ │ ├── GameEndIconLabel.kt
│ │ ├── GameItem.kt
│ │ └── GameSpace.kt
│ │
│ ├── services/
│ │ ├── interfaces/
│ │ │ └── RawgApiService.kt      # Retrofit API definitions
│ │ └── RetrofitInstance.kt
│ │
│ └── ui/theme/
│ ├── Color.kt
│ ├── Theme.kt
│ └── Type.kt
│
└── test/
├── ExampleUnitTest.kt
└── ExampleInstrumentedTest.kt
```

---

## 🔑 API Configuration

This app uses the **RAWG API**.

### 1. Get an API Key

Sign up at: [https://rawg.io/apidocs](https://rawg.io/apidocs)

### 2. Add API Key

In `local.properties`:

```properties
RAWG_API_KEY=your_api_key_here
```

In `build.gradle`:

```gradle
buildConfigField "String", "RAWG_API_KEY", '"' + RAWG_API_KEY + '"'
```

⚠️ **Do not commit your API key to source control.**

---

## Permissions

Add internet permission in `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

---

## Getting Started

1. Clone the repository
2. Open the project in **Android Studio (Hedgehog or newer)**
3. Sync Gradle
4. Add your RAWG API key
5. Run on emulator or physical device

---

## Testing (Planned / Optional)

* ViewModel unit tests
* Repository tests with fake data sources
* UI tests with Compose Testing APIs

---

## Screenshots

> *(Add screenshots or GIFs here once UI is finalized)*

---

## Roadmap
* 🔐 User authentication
* 📱 Display games
* 📲 Detailed View
* 🔎 Search games
* ❤️ ❤️ Favorites & saved games (Room database)
* 🌙 Dark mode enhancements
* 📡 Paging 3 integration
* 🔐 Hilt dependency injection
* 🧪 Full test coverage

---

## What This Project Demonstrates

* Modern Android development with Jetpack Compose
* Clean separation of concerns
* Scalable architecture
* modularity components
* Real-world API integration
* Production-ready project structure

---

## 📜 License

This project is for educational and portfolio purposes.

This project is licensed under the MIT License — feel free to use, modify, and distribute.

---

### 🙌 Acknowledgements

RAWG Video Games Database

Apple SwiftUI Documentation

---

## Author

**Tevin Hamilton**
Android & iOS Mobile Engineer

###Links

[GitHub TevinH14 ](http://daringfireball.net/projects/markdown/syntax)

[Linkedin Porfilo ](https://www.linkedin.com/in/tevin-hamilton-253558141/)

[ Porfilo (Update main link) ]()

---
