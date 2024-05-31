# Simple RPG Character System

## Project Overview
This project is a basic implementation of a Role-Playing Game (RPG) character system in Java. It demonstrates the creation and interaction of different character types such as Warriors, Mages, and Rogues. Each character type has unique properties and methods, simulating a simple RPG battle scenario.

## Classes and Structure

### Character Class
The `Character` class is the base class for all character types. It includes common properties and methods for all characters:
- **Properties**:
  - `name`: The name of the character.
  - `health`: The health points of the character.
  - `mana`: The mana points of the character.
  - `level`: The level of the character.
- **Methods**:
  - `attack(Character target)`: Simulates an attack on another character.
  - `defend()`: Simulates defending, which regenerates some health points.
  - `castSpell(Character target)`: Simulates casting a spell on another character.
  - `levelUp()`: Increases the character's level and improves health and mana.

### Warrior Class
The `Warrior` class inherits from the `Character` class and includes additional properties and methods specific to warriors:
- **Properties**:
  - `strength`: The strength attribute of the warrior.
  - `armor`: The armor attribute of the warrior.
- **Methods**:
  - `attack(Character target)`: Overrides the attack method to include strength and armor calculations.
  - `useShield()`: Increases the warrior's armor.

### Mage Class
The `Mage` class inherits from the `Character` class and includes additional properties and methods specific to mages:
- **Properties**:
  - `intelligence`: The intelligence attribute of the mage.
  - `spellPower`: The spell power attribute of the mage.
- **Methods**:
  - `castSpell(Character target)`: Overrides the castSpell method to include intelligence and spell power calculations.
  - `fireball(Character target)`: Casts a fireball spell, dealing damage based on intelligence and spell power.
  - `meditate()`: Regenerates mana for the mage.

### Rogue Class
The `Rogue` class inherits from the `Character` class and includes additional properties and methods specific to rogues:
- **Properties**:
  - `agility`: The agility attribute of the rogue.
  - `dexterity`: The dexterity attribute of the rogue.
- **Methods**:
  - `attack(Character target)`: Overrides the attack method to include agility and dexterity calculations.
  - `hide()`: Increases the rogue's agility.

## Main Class
The `RPGGame` class demonstrates the creation of instances of each character type and simulates interactions between them:
- Creates instances of `Warrior`, `Mage`, and `Rogue`.
- Demonstrates attacks, spell casting, and defending.
- Shows special abilities for each character type.
- Levels up the characters and prints their status before and after the battle simulation.

## How to Run
1. Compile the Java files:
   ```bash
   javac Character.java Warrior.java Mage.java Rogue.java RPGGame.java
