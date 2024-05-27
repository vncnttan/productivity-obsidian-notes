- MVC Graph
- Try make a new blade and change the route
- Make a new controller using artisan and return hello world
- Return view from controller
- Make Form

- Make Model
- Make Attribute for that model
- Showing attributes of a model to blade using view arguments compact 
- Make a form, submit using post, then show the data submitted to that form blade after it's submitted using view arguments and model.

``` powershell
php artisan serve
php artisan make:controller StudentController --resources
php artisan make:model Students -m -s # for migrate and seeding automatically made
```

Make new file using right-click for the `form.blade.php` and the `about.blade.php`

``` php

// app/Http/Controllers/StudentControllers.php
use App\Models\Students;

// inside the StudentController Class
public function index()
    {
        return view('about');
    }
    public function form(){
        $student = new Students();
        return view('form', compact(var_name: 'student'));
    }
    public function inputForm(Request $request){
        $student = new Students();
        $student->name = $request->name;
        $student->NIM = $request->NIM;
        $student->age = $request->age;
        return view('form', compact(var_name: 'student'));
    }

// app/Models/students.php
class Students extends Model
{ // Make attribute for the models and the default
    use HasFactory;
    protected $attributes = [
        'name' => 'matthew',
        'NIM' => '2602118981',
        'age' => 19
    ];
}

// assets/views/about.blade.php
<body>
    <h1>About This Website, hello World</h1>
    <a href="/form"> -> Form click here <- </a>
</body>

// assets/views/form.blade.php
<body>
  <h1>FORM</h1>
  <h2>{{ $student->name}}</h2>
  <h2>{{ $student->NIM}}</h2>
  <h2>{{ $student->age}}</h2>
  <form method="post" action="{{ route('form') }}">
    {{ csrf_field() }} // To avoid crash because no authentication first
    <input type="text" name="name" placeholder="name">
    <input type="text" name="NIM" placeholder="NIM">
    <input type="number" name="age" placeholder="age">
    <button type="submit">Submit</button>
  </form>
</body>

// routes/web.php
use Illuminate\Support\Facades\Route;
use \App\Http\Controllers\StudentController;

Route::get('/', function () {
    return view('welcome');
});
Route::get('/about', [StudentController::class, 'index']);
Route::get('/form', [StudentController::class, 'form']);
Route::post('form', [StudentController::class, 'inputForm'])->name(name: 'form');

// .env
DB_CONNECTION=mysql
DB_HOST=127.0.0.1
DB_PORT=3306
DB_DATABASE=trial
DB_USERNAME=root
DB_PASSWORD=
```