@extends('layouts.app')

@section('content')
    <h1>Ajouter un arret</h1>
    {!! Form::open(['action' => 'AdminController@ajouterarret', 'method' => 'POST']) !!}
        <div class="form-group">
            {{Form::label('nom', 'Nom')}}
            {{Form::text('nom', '', ['class' => 'form-control', 'placeholder' => 'Title'])}}
        </div>
        {{Form::submit('Submit',['class' => 'btn btn-primary'])}}
    {!! Form::close() !!}
@endsection