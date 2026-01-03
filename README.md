<img width="500" height="500" align="right" alt="Retro-Media-Emporium-logo" src="https://github.com/user-attachments/assets/8eefb818-cad2-4585-8861-8f7afe0cf123" />

# Retro Media Emporium
Retro Media Emporium (RME) is a Java program I am building to track my personal collection of books, DVDs, and CDs. Over the years, I’ve curated a substantial physical media library. Friends often borrow items, and sometimes things don’t make it back or memories of lending fade. RME keeps everything organized, making lending fun, social, and accountable.

## Why I Built This
I wanted a project that is practical, nostalgic, and playful. It allows me to practice Java while celebrating my love of physical media and fostering a sense of community. I may even create little physical cards or a mini card catalog, a combination of a 90s-style library system and Blockbuster video store.

## Learning Goals 
- Object-oriented programming with classes, encapsulation, methods, and constructors (Book.java and Library.java).
- Strings & data representation for titles, authors, borrower names.
- Control flow with loops and conditionals for menu navigations.
- Collections to manage media using ArrayLists.
- File handling (planned) to save and load the library between sessions, continuity.
   
## Current Features
- Add new books to the library.
- Register friends as borrowers.
- Lend books to friends and mark them as returned.
- View which items are available and which are currently lent out.

## Future Features
- Save and load the library to a file.
- Add DVDs, CDs, and possibly tools like a soldering iron or electronics.
- Physical card catalog/retro UI (icy Y2K asthetic or dark 90s industrial).
- Create 3D assets in Blender.

## Stack used
- Java
- HTML, CSS, JS (future appearance and interactive upgrades)
- Blender to build assets (future)

## How to run the project:
1. Clone the repository.
2. Open the project in a Java IDE of choice.
3. Run LibraryApp.java, and follow the on-screen menu.

## File Structure
```
RetroMediaEmporium/
├── src/
│   ├── Book.java
│   ├── Library.java
│   └── LibraryApp.java
├── README.md
├── logo.png
└── assets/      (wireframes, mockups, screenshots, GIFs, photos, 3D assets)
```
## Logic Diagram
```mermaid
flowchart TD

    A[User selects an action] --> B{Checkout or Return book?}

    %% LEND FLOW
    B -->|Lend Book| C{Is the book already checked out?}
    C -->|No| D[Mark book as lent]
    D --> E[Store borrower name]
    E --> F[Confirm: Book checked out successfully]

    C -->|Yes| G[Display error: Book already checked out]

    %% RETURN FLOW
    B -->|Return Book| H{Is the book currently checked out?}
    H -->|Yes| I[Clear borrower name]
    I --> J[Mark book as available]
    J --> K[Confirm: Book returned]

    H -->|No| L[Display error: Book was not checked out out]
```

## Inspiration
Inspired by 90s video stores and classic libraries, RME captures the fun of browsing physical media, sharing it with friends, and keeping things organized in one digital package.

## How to Contribute
Want to contribute? You can add support for site expansion with DVDs and CDs, implement file saving, or create an interactive graphical interface.
