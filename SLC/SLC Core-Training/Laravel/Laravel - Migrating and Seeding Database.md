- Make Model with auto migrate and seed file
- Configure the migrate file for that model to be added to the database
- Configure the seed, for initial value of the table that was just migrated
``` powershell
php artisan serve
php artisan make:model -m -s
php artisan migrate:fresh
php artisan migrate:fresh --seed
```

```php
// database/migrations/timestamp_create_student_table.php
    public function up()
    {
        Schema::create('students', function (Blueprint $table) {
            $table->id();
            $table->timestamps();
            $table->string('name');
            $table->string('NIM');
            $table->integer('age');
        });
    }

// database/seeders/databaseSeeders.php below the factory, inside the run function
$this->call(StudentSeeder::class);

// database/seeders/studentSeeders.php inside the run function
DB::table('students')->insert([
	'name'=> 'vncnt',
	'NIM'=> '2602128346',
	'age'=> 18,
	'created_at'=> Carbon::now()->format('Y-m-d H:i:s'),
	'updated_at'=> Carbon::now()->format('Y-m-d H:i:s')
]);
```