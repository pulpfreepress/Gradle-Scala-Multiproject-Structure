# Gradle-Scala-Multiproject-Structure
Gradle multi-project structure with one root project and three sub-projects plus aggregated Scala docs

This is a mixed Java & Scala project structured like so:

    solution (root project)
       |- presentation-layer (sub-project)
       |- business-logic-layer (sub-project)
       |- data-access-layer (sub-project)
       |- infrastructure-layer (sub-project)

 Each sub-project is setup to build independently.
 javadocs and scaladocs tasks will run from the root project but only build documentation in sub projects. 
 Run ./gradlew docs from the root project to build consolated (java and scala) Scala documentation at the root level.
 
 I've used com.pulpfreepress.[layer] as the package structure. You'll obviously want to change this. I also added dependencies to spark to all sub-projects. 
 
 Rick Miller
 rick@pulpfreepress.com
