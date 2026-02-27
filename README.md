# Projet: Dependency Injection Practice
**Auteur:** Hafssa Miftah Idrissi

## Avancement :
- **Initial Setup:** Lier IntelliJ à GitHub et configurer le project.
- **Etat 1:** J'ai crée une interface IDao et une implémentation DaoImpl Pour appliquer le principe "fermé à la modification et ouvert à l'extension". Puis une interface IMetier et une implémentation MetierImpl pour la meme raison, cette implémentation aura besoin d'un attribut de type IDao dont j'ai spécifié deux méthodes pour injecter cet attribut; soit avec un constructeur avec paramètres qui s'occupera de l'injection lore de l'instantiation ou avec un setter qui utilisera un constructeur sans paramètres.
- **Etat 2:** J'ai crée le fichier pres1 dans la couche présentation qui implémente le couplage faible et l'injection statique des dépendences via constructeur et setter. Cette version de la couche présentation est ouverte à la modification!
- **Etat 3:** On peut avoir besoin d'une autre implementation de l'interface IDao Par exemple la classe implementation DaoImplV2, on constate que pour l'utiliser on doit toucher au code source de la présentation. Cela nous remet à penser à l'instantiation dynamique de la classe Factory presentation.
- **Etat 4:** J'ai crée une autre version de la couche presentation dont on utilisera l'instaciation dynamique avec le fichier config.txt dont on definit les noms des classes qu'on aura besoin dans la couche présentation pour qu'elle reste fermé à la modification. Le process c'est qu'on lit le fichier et on stocke les noms des classes définit en gérant les Exception. 