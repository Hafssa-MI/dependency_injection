# Projet: Dependency Injection Practice
**Auteur:** Hafssa Miftah Idrissi

## Avancement :
- **Initial Setup:** Lier IntelliJ à GitHub et configurer le project.
- **Etat 1:** J'ai crée une interface IDao et une implémentation DaoImpl Pour appliquer le principe "fermé à la modification et ouvert à l'extension". Puis une interface IMetier et une implémentation MetierImpl pour la meme raison, cette implémentation aura besoin d'un attribut de type IDao dont j'ai spécifié deux méthodes pour injecter cet attribut; soit avec un constructeur avec paramètres qui s'occupera de l'injection lore de l'instantiation ou avec un setter qui utilisera un constructeur sans paramètres.
- **Etat 2:** J'ai crée le fichier pres1 dans la couche présentation qui implémente le couplage faible et l'injection statique des dépendences via constructeur et setter. Cette version de la couche présentation est ouverte à la modification!