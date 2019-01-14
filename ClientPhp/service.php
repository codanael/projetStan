<?php
ini_set("soap.wsdl_cache_enabled", "0"); //Permet de reset le cache du WSDL (Lorsque je faisais un changement sur le service web java, cela ne se répercutait pas sur le php car il gardait l'ancien wsdl en cache)

 $clientSOAP = new SoapClient("http://localhost:8080/CoucheWebUtilisateurStan/WebServiceUtilisateurStan?wsdl");

 $id = 0;
 $nom = "";
 $prenom = "";
 $dateDeNaissance="00-00-0000";

 //Récupération des données des formulaires
 if(isset($_GET["arg0"]))$id = $_GET["arg0"];
 if(isset($_GET["nom"]))$nom = $_GET["nom"];
 if(isset($_GET["prenom"]))$prenom = $_GET["prenom"];
 if(isset($_GET["dateDeNaissance"]))$dateDeNaissance = $_GET["dateDeNaissance"];

 /*
 $functions = $clientSOAP->__getFunctions ();
var_dump ($functions);
*/
 $AfficherParam= array(
    "arg0" => $id
);
$AfficherTableParam= array();

$AjouterParam= array(
    "nom" => $nom,
    "prenom" => $prenom,
    "dateDeNaissance" => $dateDeNaissance
);

if($id>0) $AfficherRes=$clientSOAP->__soapCall("getUtilisateur", array($AfficherParam));

 ?>
<html>
 <body>
 <form action="service.php" method="get">
 <input type="text" name="arg0" value="id"> 
 <button> Afficher utilisateur</button>
 </form>


<?php 
 if(isset($_GET["arg0"]) && isset($AfficherRes)) echo $AfficherRes->return->nom ; echo " ". $AfficherRes->return->prenom ;
 ?>

<form action="service.php" method="get">
 <input type="text" name="nom" value="nom"> 
 <input type="text" name="prenom" value="prenom"> 
 <input type="date" name="dateDeNaissance">  
 <button> Ajouter utilisateur</button>
 </form>


<?php 
if(isset($_GET["nom"]) && isset($_GET["prenom"]) && isset($_GET["dateDeNaissance"])) $AjouterRes=$clientSOAP->__soapCall("ajouterDate", array($AjouterParam));
 ?>

<body>
 <form action="service.php" method="get">
 <input type="checkbox" name="table" > Afficher la table ? <br>
 <button> Table</button>
 </form>
 <?php
if(isset($_GET["table"]))$AfficherTableRes=$clientSOAP->__soapCall("afficherListeUtilisateur",array($AfficherTableParam));
if(isset($AfficherTableRes)){
    foreach($AfficherTableRes->return as $res){
        echo $res->nom." ".$res->prenom. "<br>";
    }
}
 ?>

</body>
</html>
