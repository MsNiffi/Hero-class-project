## About
The Hero Class project, is a java application that simulates the logic of an MMORPG. I have used this task to pratice the following topics:
* Unit testing
* Inheritance
* Enums
* Working with a large code base
* Making changes to a large code base / reformatting code

Due to illness, which lead to me having to reformated the project, all of my git commit messages was lost. I learned in this project, that 
coding while tierd and very sick is a bad idea. I could not think straight, which lead to very messy code. So I decided to reformat the project, leading to
me losing all my commit messages. 

## Description and structure
All the tests can be found in the *test* folder.

The main method does nothing, to check if the project works, check out the unit tests.

There are some good to know folders and classes in the project:
* Character >>> Hero 
Here you can find most of the general logic and data types needed to represent any "Hero class" such as black mage or warrior.
Unfortunatly, I didn't find a good way to write a general getTotalHeroDamage() method, so this is implemented for every Hero class.

* Attributes >>> Attributes
This class holds the general attributes, or "stats", such as int, dex and str. 

* customException 
This folder holds all custom exceptions. 

* Items
The items folder holds all the different item related classes. Such as the parent class "Items" and the Armor and Weapon classes. 

## Credit:
My brother helped me write this README file.
