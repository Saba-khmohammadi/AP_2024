# Gwent Online - Multiplayer Card Game

## Overview

Gwent Online is a complete implementation of the Gwent card game featuring a graphical user interface, turn-based gameplay mechanics, online multiplayer support, and a client-server architecture. The project was developed as part of the Advanced Programming course with the goal of implementing a real-world multiplayer game system.

The game includes all core Gwent mechanics such as card management, rounds, scoring system, player interactions, and game rules, along with additional features including authentication, matchmaking, social systems, live spectating, and persistent data storage.

---

# Features

## Game Mechanics

* Full implementation of Gwent gameplay rules.
* Graphical user interface for all menus and game screens.
* Turn-based multiplayer matches.
* Card selection and deck management.
* Different kingdoms and card collections.
* Round management and score calculation.
* Game reactions using messages, emojis, and quick responses.

---

## User Management & Authentication

* User registration and login system.
* Secure authentication mechanism.
* Persistent user profiles and statistics.
* Online/offline user status tracking.
* Player ranking based on match victories.

Additional implemented features:

* Email verification during registration.
* Two-factor authentication (2FA) using a six-digit verification code.

---

## Social System

* Search for other players.
* Send and receive friend requests.
* Accept or reject friendship requests.
* Friend list management.
* Direct game invitations between friends.

---

## Matchmaking System

Players can start games in two different ways:

### Friend Match

* Send a direct invitation to an online friend.
* The invited player receives a game request popup.
* After acceptance, both players prepare their decks and start the match.

### Random Match

* Players enter a matchmaking queue.
* The server automatically matches available players.

Games can be created as:

* Public matches
* Private matches

---

## Client-Server Architecture

The project follows a client-server model where:

* The server handles the main game logic.
* Multiple matches can run simultaneously.
* Clients send requests to the server and receive responses.
* Game states and player data are synchronized through the server.

---

## Data Persistence

All important data remains available after restarting the application, including:

* User accounts.
* Player statistics.
* Friends and relationships.
* Decks and card collections.
* Match history.

Data is stored using structured formats such as JSON/XML or a database.

---

## Leaderboard

The leaderboard provides:

* Ranking based on the number of victories.
* Real-time updates.
* Display of players' online or offline status.
* Viewing replays of top players' latest matches.

---

## Live Spectating & Replay System

### Live Streaming

Players can watch ongoing public matches in real-time.

For private matches, only players who are friends with both participants can watch the game.

The replay system is implemented using game logs, allowing the application to recreate the game state by replaying recorded actions.

### Match Replay

Players can review their previous matches and analyze their gameplay.

---

## In-Game Chat System

A live chat system is available during matches and spectating sessions.

Features include:

* Public messages.
* Displaying sender information.
* Message timestamps.
* Message replies and reactions.

---

## Cheat Console

The game includes a hidden developer console that provides special commands for testing and debugging purposes.

Example cheat abilities:

* Adding cards to a player's deck.
* Restoring crystals or resources.
* Modifying certain game conditions.

---

## In-Game Terminal

An interactive terminal is available during execution to allow command-based interaction with the game.

The terminal can be implemented as either:

* A graphical terminal.
* A standard command-line terminal.

---

## Tournament Mode (Bonus Feature)

The game supports a double-elimination tournament system where:

* Eight players enter a tournament bracket.
* Players move between winner and loser brackets.
* A player is eliminated after two losses.
* Live games and tournament brackets are updated in real-time.

---

## Reconnection System (Bonus Feature)

If a player disconnects during a match, they have a limited amount of time to reconnect and continue the game.

If the player does not return before the timeout, they automatically lose the match.

---

## Technologies Used

* Java
* JavaFX / Swing for GUI
* Socket Programming
* Client-Server Networking
* JSON/XML or Database Storage
* Object-Oriented Design Patterns

---

## Learning Objectives

This project focuses on practical experience with:

* Designing large-scale object-oriented applications.
* Developing graphical user interfaces.
* Implementing network-based multiplayer systems.
* Managing client-server communication.
* Data persistence and database concepts.
* Designing complex game logic.
