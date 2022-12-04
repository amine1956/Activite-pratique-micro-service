# énoncé d'activité
  ![image](https://user-images.githubusercontent.com/73759527/205516942-aaf36b6c-602a-454d-bf04-0c47ddf5925a.png)
  # BackEnd
  ## la configuration des services
 * les dépandances de projet de configuration
 ![image](https://user-images.githubusercontent.com/73759527/205517144-88705f9a-29df-400c-8fc6-47ebde2652dc.png)
 * la class de la configuration 
 ![image](https://user-images.githubusercontent.com/73759527/205517225-73ceb81c-7df6-4073-90a3-fe48deb326cd.png)
* le fichier application.properties
![image](https://user-images.githubusercontent.com/73759527/205517243-417fe34c-9b5c-4549-ae70-3a6c5e190039.png)
* les défferents fichiers de configurartion :

![image](https://user-images.githubusercontent.com/73759527/205517522-52122006-f184-4f0b-a09b-378b1806a0aa.png)
## le routage dynamique:(gateway-service)
* la class principale :
![image](https://user-images.githubusercontent.com/73759527/205517588-6991d77c-ac98-428c-8168-42ac1b9c534d.png)
* les dépandances :


![image](https://user-images.githubusercontent.com/73759527/205517679-ba00049a-2947-4ba6-bfb4-15c044413499.png)
* Consul Discovery service 

![image](https://user-images.githubusercontent.com/73759527/205517799-39c211fa-a3da-47c9-9b47-b066b792244b.png)
* demarage de consul:

![image](https://user-images.githubusercontent.com/73759527/205517836-09eff617-afe4-4410-ad18-9ee2e72cfb8d.png)

![image](https://user-images.githubusercontent.com/73759527/205517880-51dbf09e-f208-40e3-af32-368cff597411.png)

## customer Service:
* la class Customer :

![image](https://user-images.githubusercontent.com/73759527/205517969-e405dad3-98c5-4bcf-b3b7-ccb885ae34a9.png)

* les projections de Customer en utilisant RepositoryRestResource

![image](https://user-images.githubusercontent.com/73759527/205518041-96d37b79-e2c6-4072-bd79-7295312527df.png)
![image](https://user-images.githubusercontent.com/73759527/205518108-4562dc20-a059-40e1-ae07-b6ae4c4948d7.png)

## le service inventory-service
* la class Product:

![image](https://user-images.githubusercontent.com/73759527/205518157-31b792ea-5373-4d9d-ac71-0e4efa19b928.png)

* les Projection:

![image](https://user-images.githubusercontent.com/73759527/205518185-423e3417-3635-4cdc-9d1b-3477ced7ceb2.png)

## order-service

* la class Order

![image](https://user-images.githubusercontent.com/73759527/205518315-90b47e87-17ee-4bcc-851f-ec8944ea1101.png)

* les projection:

![image](https://user-images.githubusercontent.com/73759527/205518344-1b2e29bd-4be0-42d0-981f-2092809e81cd.png)

# FrontEnd part:

dans cette partie j'ai utilisé Angular avec Primeng et aussi primeFlex 

* Angular est un framework d'application Web gratuit et open source basé sur TypeScript, dirigé par l'équipe Angular de Google et par une communauté d'individus et d'entreprises. Angular est une réécriture complète de la même équipe qui a construit AngularJS. 

* PrimeNG is a collection of rich UI components for Angular. All widgets are open source and free to use under MIT License. PrimeNG is developed by PrimeTek Informatics, a vendor with years of expertise in developing open source UI solutions.

* PrimeFlex est une bibliothèque utilitaire CSS réactive et légère qui accompagne également les bibliothèques Prime UI et les pages Web statiques .


## les modèles:
![image](https://user-images.githubusercontent.com/73759527/205518637-9eda6903-c3b1-4ed5-8167-98f9f4735d5f.png)

## les components:

![image](https://user-images.githubusercontent.com/73759527/205518779-f3afc433-5b75-4bb9-b7e6-7779909d333f.png)


## la communication avec le Backend on utilisant HttpClient

![image](https://user-images.githubusercontent.com/73759527/205518837-0345609d-be6c-433a-ab68-ca08cfe95a52.png)

## la partie Html en utilisant primeNg:

![image](https://user-images.githubusercontent.com/73759527/205518876-06957ad7-5d1d-4cc4-90c4-885901252312.png)

## resultat:

![image](https://user-images.githubusercontent.com/73759527/205518963-a059a485-8565-4cbe-b17f-2e0da86651b3.png)

![image](https://user-images.githubusercontent.com/73759527/205518977-edd43fc8-9105-47a8-87b7-76fa0adea259.png)

![image](https://user-images.githubusercontent.com/73759527/205518994-12e59852-4f06-4727-a54d-25be95f3481e.png)

![image](https://user-images.githubusercontent.com/73759527/205519011-1cb7a6e4-5620-410c-9cc5-909843f094c0.png)





