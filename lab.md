# Manipulation dans le REPL

##Documentation
La scaladoc est une ressource essentielle pour appréhender l'API Scala, elle est accessible [ici](http://www.scala-lang.org/api/current/#package) 

# LAB 01

L'objectif de ce premier lab est de manipuler les bases du language à l'aide du RPEL fournit avec Scala.
Ou de la fonctionnalité **WorkSheet** (dispo dans les IDEs). C'est un REPL évolué. 

##Lancer le RPEL

Ouvrir une console et lancer la commande :
	
	sbt

Ensuite lancer la commande : 

	>console

Vous devriez avoir le résultat suivant : 

	> console
	[info] Compiling 2 Scala sources to C:\dev\perso\UniversiteLangage_Scala\target\scala-2.10\classes...
	[info] Starting scala interpreter...
	[info]
	Welcome to Scala version 2.10.2 (Java HotSpot(TM) Client VM, Java 1.7.0_06).
	Type in expressions to have them evaluated.
	Type :help for more information.

	scala>
	
A partir de là vous êtes prêt à démarrer.

## 1. Exercices : Basiques

### 1.1. Hello world

Afficher dans le REPL le traditionnel : Hello World!

### 1.2. UnEntier

Déclarer une variable mutable nommée : **unEntierMutable** et a affecter lui la valeur : **10**

Déclarer une variable immutable nommée : **unEntierImmutable** et a affecter lui la valeur : **20**

*Par définition la première variable pourra être réacffectée tandis que la deuxième non, faites l'expérience*

### 1.3. UneFonction

Déclarer une fonction *f* prenant en paramètre deux entiers (a et b) et renvera la somme de a et b.

*Pour cette exercice écrire la déclaration complète sans utiliser l'inférence ou la notation lambda*

### 1.4. UneFonction inconnue

Déclarer une fonction *g* utilisant la notation **lambda**. Cette fonction prend 1 paramètre et lui ajoute 1.

### 1.5. Une classe

Déclarer une classe **Ferrari**. Elle aura plusieurs attributs : 
 - nbPorte (privé)
 - couleur (immutable)
 - nbPassager (mutable)

### 1.6. Un trait

Déclarer un trait **Véhicule** . Il aura un champ définissant la **marque** du véhicule et un fonction **displayNbPorte** à redéfinir affichant le nombre de porte

Ensuite créer une classe étendant ce trait qui représente une marque particulière. Le nombre de porte affiché par le méthode displayNbPorte doit être paramétrable.

## 2. Exercices : Avancés

### 2.1. Implicit : conversion 

Ecrire un mécanisme permettant de convertir automatiquement un entier en une chaîne de caractère de manière à ce que l'on puisse appeler la fonction suivante en lui passant un entier en paramètre :

	def afficherPoid(poid: String)={
		println("le poid est de " + poid + "Kg") 
	}

### 2.2. Implicit : ajout
Soit la classe Voiture suivante : 

	class Voiture(val name:String)

Ajouter à cette classe une méthode **rouler** sans modifier la déclaration de la classe. Cette méthode permettra d'afficher la chaîne suivante : *la voiture [name] roule*

#LAB 02

On va travailler maintenant dans l'IDE. Si ce n'est pas encore fait, générer les la config pour votre projet (cf README du projet)

Pour ce lab, on va implémenter la suite de Fibonacci.  Dans le projet, vous trouverez un package **org.univ.lang.scala.lab2** une classe possédant 2 méthodes qu'il faut implémenter. Vous avez un TU permettant de valider l'implémentation.

L'objectif de ce lab est de fournir une implémentation de l'algo de la suite de Fibonacci les outils comme le pattern matching et la récursivité.

#LAB 03

L'objectif de ce lab est d'implémenter un FIZZ BUZZ en Scala et décrire les tests associés.

	Rappel : la spécification du FIZZ-BUZZ, afficher :
		* “fizz” si le nombre est divisble par 3
		* “buzz” si le nombre est divisble par  5
		* “fizzbuzz” si le nombre est divisble par  15
		* Le nombre lui même, si le nombre de rentre pas dans les règles ci-dessus.

Tenter dans un premier temps une implémentation classique puis une implémentation à base de pattern matching.
	

#LAB 04

L'objectif de ce lab est de reprendre l'implémentation d'un code Java implémenté de manière tout à fait classique. 
Les classes se trouvent dans le package **univ.lang.java.lab4**, dans la partie java (selon les conventions Maven).

Des TUs pour l'implémentation existante sont fournis.

Dans un premier temps, il faudra reprendre en Scala les différentes classes et interfaces. 
Ensuite il faudra écrire les TU à l'aide de l'API FunSuite fournie par ScalaTest.
Et enfin fournir une implémentation en utilisant l'API des collections en Scala et une approche monadique.

	Rappel: en Scala on peut utiliser l'opérateur ??? pour indiquer que l'implémentation n'est pas encore disponble.
	exemple : 
	```scala
	def fibo(n: Int): Int = ???
	```
#LAB 05

L'objectif de ce lab est de refactorer l'implémentation faite en Scala de **GildedRose**
J'ai récupéré ce kata sur ce [dépôt github](https://github.com/emilybache/GildedRose-Refactoring-Kata) 

Un test est fournit pour l'implémentation proposée.





