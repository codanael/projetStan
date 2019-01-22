@extends('layout.app')

@section('content')
    <h1>Arrets</h1>
    {{-- {{var_dump($reponseSOAP )}} --}}

    @if ($reponseSOAP->return != null)
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
        @else
            <p>No horraire found</p>
        @endif
    @endif
@endif 
@endsection