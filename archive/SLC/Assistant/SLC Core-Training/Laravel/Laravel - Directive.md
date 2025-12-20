- yield - bagian content yang akan ditimpa
  `@yield('title');`
  
- extends - extends from template to a desired view
  `@extends('navbar');`
  akan extends dari navbar.blade.php
  
- Section - apa yang ditimpa dari yield yang mana
  `@section('title', 'Home');`
  `@section('content'); blabla @endsection`
  
- If else
``` php
  @if (2 == 1)
	  test
  @elseif
	  test1
  @else
    test2
  @endif 
  ```
  
- Loop
``` php
@for($i = 0; $i<5; i++)
	{{ $i }}
@endfor
```