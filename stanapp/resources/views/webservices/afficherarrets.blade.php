@extends('layout.app')

@section('content')
    <h1>Arrets</h1>
    {{-- {{var_dump($reponseSOAP->return )}} --}}

    @if (($reponseSOAP) != null)
    <ul class="list-group">
        @foreach ($reponseSOAP->return as $reponse)
            <div class="well">
            <li class="list-group-item"><a href="/webservices/horrairesarret/{{$reponse->id}}">{{$reponse->nom}}</a></li>
            </div>
        @endforeach
    </ul>
    @else 
        <p>No arret found</p>
    @endif 
@endsection