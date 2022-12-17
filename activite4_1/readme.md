
# Sécurité des micro services avec Keycloak
## Télécharger Keycloak 19
on peut télécharger Keycloak apartir de site https://www.keycloak.org/

![image](https://user-images.githubusercontent.com/73759527/208266896-e63ac7cc-4434-496b-9b11-e79d5d66d50a.png)

##  Démarrer Keycloak 

![1](https://user-images.githubusercontent.com/73759527/208266925-6874186d-4e24-456c-b88d-2402e63a9f95.PNG)

## Créer un compte Admin

![Cadministrateur](https://user-images.githubusercontent.com/73759527/208266984-cd5666a2-b9a4-49ce-9f53-3f5c742680af.PNG)

![consoleAdlinstarrtion](https://user-images.githubusercontent.com/73759527/208266998-2aad4ddc-da13-4400-88b3-e5119808bd00.PNG)


##  Créer une Realm

![creationRealm](https://user-images.githubusercontent.com/73759527/208267013-cc3fb4dc-cb34-4116-90c8-3de4567fcf9c.PNG)


## Créer une client sécuriser

![creationClient](https://user-images.githubusercontent.com/73759527/208267072-b3fbab66-62fc-4269-a055-722c356c322b.PNG)

![ClinetConfegurartion](https://user-images.githubusercontent.com/73759527/208267088-0f7377f6-40bb-429f-9fbe-5d9f8362b853.PNG)


## Créer des utilisateurs

![crietEtulisteur](https://user-images.githubusercontent.com/73759527/208267116-72818163-d275-4291-9e7f-17dec858d147.PNG)

![apresCretion](https://user-images.githubusercontent.com/73759527/208267153-d9246d1f-3a09-4a02-b101-8ae675923ddd.PNG)



## Créer des rôles

![crierRole](https://user-images.githubusercontent.com/73759527/208267176-8a633f1f-664e-4daf-8384-fa69917455df.PNG)


##  Affecter les rôles aux utilisateurs

![addUserRole](https://user-images.githubusercontent.com/73759527/208267194-d9a884ab-067f-494d-b32d-c1c33fa3d6c5.PNG)

## Avec PostMan :

Tester l'authentification avec le mot de passe

![testPosteman](https://user-images.githubusercontent.com/73759527/208267265-74fd12b9-b9ec-46bf-ace3-1541f0de0c70.PNG)

 Analyser les contenus des deux JWT Access Token et Refresh Token
 
![jwtRoles](https://user-images.githubusercontent.com/73759527/208267294-e144502e-dcba-4c55-b07f-537b32904411.PNG)

Tester l'authentification avec le Refresh Token

![recupererNaccesTocken](https://user-images.githubusercontent.com/73759527/208267323-2a8d6e3d-6282-4ac6-82b3-217c9a0fed3d.PNG)

Tester l'authentification avec Client ID et Client Secret

![clientCredentials](https://user-images.githubusercontent.com/73759527/208267338-f236922d-b35d-4b65-be62-8be1bf9836b0.PNG)

Changer les paramètres des Tokens Access Token et Refresh Token

![solusio3](https://user-images.githubusercontent.com/73759527/208267352-4f8e6927-8c5f-425a-8d0b-950a073fbf76.PNG)


# Sécuriser L'architecture Micro services Du projet Customer-service, Inventory-service et Order-service

## étape 1: ajouter les dépandances:

![image](https://user-images.githubusercontent.com/73759527/208267400-bca70ecc-690f-4fe7-b18f-1eedbe54899d.png)

## étape 2: le fichier application.properties

![image](https://user-images.githubusercontent.com/73759527/208267428-bb042bf3-c856-4fe8-a6f7-65fa79eb8f15.png)


## le package securité:
* crier la class KeycloakAdapterConfig

![image](https://user-images.githubusercontent.com/73759527/208267464-1c0eeef2-6c89-4a88-85e5-1b79ead27e34.png)
 
*  dans la class SecurityConfig

![image](https://user-images.githubusercontent.com/73759527/208267567-87f8cf13-6252-4da1-8c36-47a4fdf3cc1d.png)


## Authentification:

![image](https://user-images.githubusercontent.com/73759527/208267628-01eef873-abea-4955-a310-90a244064ad3.png)

##  retourner tout les customers

![image](https://user-images.githubusercontent.com/73759527/208267666-9cb94941-4c94-4a18-b2a9-e4a19b90ce99.png)
