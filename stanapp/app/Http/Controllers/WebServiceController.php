<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\lignebus;
use SoapClient;

class WebServiceController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        /*$generator = new \Wsdl2PhpGenerator\Generator();
        $generator->generate(
            new \Wsdl2PhpGenerator\Config(array(
                'inputFile' => 'http://localhost:8080/CoucheWebBusStan/WebServiceStan?wsdl',
                'outputDir' => '/'
            ))
        );*/

        $clientSOAP = new SoapClient("http://localhost:8080/CoucheWebBusStan/WebServiceStan?wsdl");
        $functions = $clientSOAP->__getFunctions();
        return view('webservices.index')->with('fonctions', $functions);
        
        /*$lignes = lignebus::all();
        return view('webservices.index')->with('lignes', $lignes);*/

    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        return $id;
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        //
    }
}
