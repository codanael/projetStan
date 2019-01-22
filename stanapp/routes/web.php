<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', 'PagesController@index');

Route::get('/about', 'PagesController@about');

Route::get('/services', 'PagesController@services');

Route::get('/webservices/afficherarrets', 'WebServiceController@afficherarrets');

Route::get('/webservices/afficherarretsligne/{idligne}', 'WebServiceController@afficherarretsligne');

Route::get('/webservices/afficherlignes', 'WebServiceController@afficherlignes');

Route::get('/webservices/horrairesarret/{idarret}', 'WebServiceController@horrairesarret');

Route::get('/webservices/horrairesarretligne/{idarret}/{idligne}', 'WebServiceController@horrairesarretligne');

Route::get('/webservices/arret/{idligne}', 'WebServiceController@afficherarrets');

Route::resource('posts', 'PostsController');

Route::resource('webservices', 'WebServiceController');