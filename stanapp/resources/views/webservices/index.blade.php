@extends('layout.app')

@section('content')
    <h1>Web services</h1>
    @if (count($fonctions) > 0)
    <ul class="list-group">
        <?php $i = 0; ?>
        @foreach ($fonctions as $fonction)
            <div class="well">
            <li class="list-group-item">{{$fonction}}</a></li>
            <?php $i++; ?>
            </div>
        @endforeach
    </ul>
    @else 
        <p>No services found</p>
    @endif
@endsection