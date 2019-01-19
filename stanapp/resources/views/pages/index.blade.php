@extends('layout.app')

@section('content')
    <div class="jumbotron texte-center">
        <h1>{{$title}}</h1>
        <p>Application faite dans le cadre du cours de systemes distribués</p>
        <p><a class="btn btn-primary btn-lg" href="/login" role="button">Login</a> <a class="btn btn-success btn-lg" href="/register" role="button">Register</a></p>
    </div>
@endsection
