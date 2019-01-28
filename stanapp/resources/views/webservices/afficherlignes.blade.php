@extends('layouts.app')

@section('content')
    <h1>Lignes</h1>
    {{-- {{var_dump($reponseSOAP->return )}} --}}

    @if (($reponseSOAP) != null)
    <ul class="list-group">
        @foreach ($reponseSOAP->return as $reponse)
            <div class="well">
            <li class="list-group-item"><a href="/webservices/afficherarretsligne/{{$reponse->id}}">{{$reponse->numero}}</a></li>
            </div>
        @endforeach
    </ul>
    @else 
        <p>No ligne found</p>
    @endif 
@endsection