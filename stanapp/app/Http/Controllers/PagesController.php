<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class PagesController extends Controller
{
    public function index(){
        $title = 'Welcome to Stanapp !';
        //return view('pages.index', compact('title'));
        return view('pages.index')->with('title',$title);
    }

    public function about(){
        return view('pages.about');
    }

    public function services(){
        $data = array(
            'title' => 'Services',
            'services' => ['Ajouter arret', 'Ajouter horraire', 'Ajouter ligne']

        );
        return view('pages.services')->with($data);
    }
}
