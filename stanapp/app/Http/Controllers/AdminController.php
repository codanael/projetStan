<?php

namespace App\Http\Controllers;

ini_set("soap.wsdl_cache_enabled", "0");

use Illuminate\Http\Request;
use SoapClient;

class AdminController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth');
    }
    public function admin()
    {
        return view('admin');
    }

    public function ajouterarret(Request $request)
    {
        $this->validate($request, [
            'nom' => 'required'
        ]);
        $clientSOAP = new SoapClient("http://localhost:8080/CoucheWebBusStan/WebServiceStan?wsdl");
        $arg0 = array(
            'nom' => $request->nom
        );
        $reponseSOAP = $clientSOAP->__soapCall('ajouterArret',array($arg0));

        return redirect('webservices/afficherarrets')->with('success', 'Arret créé');
    }

    public function ajouterarretform()
    {
        return view('webservices.ajouterarretform');
    }
}
