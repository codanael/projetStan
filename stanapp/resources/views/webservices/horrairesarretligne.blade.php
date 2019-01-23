@extends('layout.app')

@section('content')
    <h1> @if ($nomArret->return != null)
        Horaires à l'arret {{$nomArret->return->nom}}
        
    @endif
    @if ($nomLigne->return != null)
        de la ligne {{$nomLigne->return->numero}}
        
    @endif
</h1>
    {{-- {{var_dump($reponseSOAP->return[1] )}} --}}

   @if ($reponseSOAP->return != null)
        @if(is_array($reponseSOAP->return)) 
            <ul class="list-group">
                @foreach ($reponseSOAP->return as $reponse)
                    <div class="well">
                    <li class="list-group-item">{{$reponse}}</a></li>
                    </div>
                @endforeach
            </ul>
        @else
            @if ($reponseSOAP->return != null)
            <div class="well">
                <li class="list-group-item">{{$reponseSOAP->return}}</a></li>
                </div>
            @else
                <p>No horraire found</p>
            @endif
        @endif
    @endif 
@endsection