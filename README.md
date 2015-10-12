# Université des languages : Scala

Vous allez participer à l'université des languages le Mardi 13 octobre 2015. 
Pour suivre cette session, il faut impérativement un **laptop**. 

Ensuite il faut configurer la machine pour gagner du temps le jour dit. C'est une petite configuration à faire.

Ci-dessous, vous trouverez la recette à appliquer :)

## Installer  SBT
Pour faire cette installation, je vous renvoie vers la documentation officielle de l'outil [ici](http://www.scala-sbt.org/release/tutorial/Setup.html).

## Vérifier son environnement

Une fois que l'installation est terminée, il faut cloner le projet à partir du dépôt suivant : [UnivLang_Scala](https://github.com/Zenika/UnivLang_Scala)

Une fois le dépôt cloné, placez vous à la racine du projet et lancer la commande suivante : 

		sbt run
		

et vous devriez obtenir le résultat suivant : 

		[info] Running org.univ.lang.scala.Hi
		Hello World
		[success] Total time: 0 s, completed 12 oct. 2015 10:33:18
		

Ensuite, il faut lancer la commande suivante : 

		sbt

A l'invite suivante :

        >

taper la commande suivante :

        test-only univ.lang.scala.ScalaFunSuite univ.lang.scala.HelloWorldSpec
		
et vous devriez obtenir le résultat suivant :

		[info] CheckTestFunSuite:
		[info] - Call Hi with 'Hello' has parameter should equals to 'Hello World'
		[info] HelloWorldSpec
		[info]
		[info]   This is a specification for the 'Hi' class with method
		[info]   envSbtValidation
		[info]
		[info]   Call Hi with 'Hello' has parameter should
		[info]
		[info]     + equals to 'Hello World'
		[info]     + contain 11 characters
		[info]     + start with 'Hello'
		[info]     + end with 'world'
		[info]
		[info] Total for specification HelloWorldSpec
		[info] Finished in 32 ms
		[info] 4 examples, 0 failure, 0 error
		[info]
		[info] ScalaTest
		[info] Run completed in 1 second, 401 milliseconds.
		[info] Total number of tests run: 1
		[info] Suites: completed 1, aborted 0
		[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
		[info] All tests passed.
		[info] Passed: Total 5, Failed 0, Errors 0, Passed 5

*note: pour sortir du mode interactif taper exit sur l'invit >*
		

## Configuration pour votre IDE

Il y a dans le projet deux plugins, un pour eclipse (Scala IDE) et un pour IntelliJ

Les commandes respectives pour générer les fichiers projets : 

		sbt eclipse
		
		sbt gen-idea
		

*note : Pour Eclipse, il faut utiliser la version [Scala IDE](http://scala-ide.org/) de TypeSafe et pour Intellij il faut au préalable installer les plugins Scala et Sbt*
		

Une fois toutes ces étapes effectuées, vous êtes prêt!


