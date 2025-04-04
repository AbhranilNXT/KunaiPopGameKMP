# Ninja Kunai Shooter - Kotlin Multiplatform Game

A fast-paced **Bubble Shooter**-style game built with **Kotlin Multiplatform**. Play as a ninja and shoot kunai to break bubbles before they hit the ground!

## 🎮 Gameplay
- Control a ninja who throws kunai upwards.
- Bubbles of different strengths require multiple kunai to pop.
- Gain points for every bubble you destroy.
- The game ends when a bubble reaches the ground.

## 🧙‍♂️ Sprites & Animation
- The **ninja** and **kunai** are implemented using sprite sheets.
- Ninja animations (idle, attack, etc.) are driven frame-by-frame based on the ninja sprite sheet.

## 🛠️ Tech Stack
- **Kotlin Multiplatform**: Shared logic across multiple platforms.
- **Compose for Android & iOS**: UI implementation.
- **Game Engine**: None! It completely rins on Jetpack Compose.
- **Gradle** for dependency management.

## 🚀 Features
- Cross-platform support (Android and iOS).
- Physics-based bubble movement and collision detection.
- Score tracking and game-over screen.
- Simple yet engaging gameplay loop.

## 📸 Screenshots

![App Screenshot](https://i.postimg.cc/Znt4V0Gy/Screenshot-20250405-014642.png)
![App Screenshot](https://i.postimg.cc/hvgNXxFM/Screenshot-20250405-014730.png)


## 🔧 Setup & Installation
1. Clone this repository:
   ```sh
   git clone https://github.com/AbhranilNXT/KunaiPopGameKMP.git
   ```
2. Open the project in **IntelliJ IDEA** (or any Kotlin Multiplatform-compatible IDE).
3. Sync dependencies with Gradle.
4. Run the game:
   - **Android**: Select an emulator/device and run the `androidMain` module.
   - **Desktop**: Run the `desktopMain` module.
   - **iOS (Xcode)**:
     - Open the `iosApp/iosApp.xcworkspace` in Xcode.
     - Select a simulator or real device.
     - Press **Run (▶)** to build and launch the game.

## 🎯 Future Updates
- [ ] Add power-ups and special kunai types.
- [ ] Integrate leaderboards and high score saving.
- [ ] Expand to Desktop and Web using Kotlin Multiplatform.

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repo and submit a PR with enhancements.

## 📜 License
This project is licensed under the **MIT License**.

---

⭐ **If you like this project, consider giving it a star!** ⭐

