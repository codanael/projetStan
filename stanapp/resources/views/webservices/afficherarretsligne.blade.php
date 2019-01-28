@extends('layouts.app')

@section('content')
    <h1>@if ($nomligne->return != null)
        Arrets de la ligne {{$nomligne->return->numero}}
        
    @endif</h1>
    {{-- {{var_dump($reponseSOAP->return )}} --}}

     @if (isset($reponseSOAP->return)) 
    @if(is_array($reponseSOAP->return)) 
        <ul class="list-group">
            @foreach ($reponseSOAP->return as $reponse)
                <div class="well">
                <li class="list-group-item"><a href="/webservices/horrairesarretligne/{{$reponse->id}}/{{$idligne}}">{{$reponse->nom}}</a></li>
                </div>
            @endforeach
        </ul>
    @else
        @if ($reponseSOAP->return != null)
        <div class="well">
            <li class="list-group-item"><a href="/webservices/horrairesarretligne/{{$reponseSOAP->return->id}}/{{$idligne}}">{{$reponseSOAP->return->nom}}</a></li>
            </div>
        @endif
    @endif
    @else
            <p>No Arret found</p>
@endif 
@endsection