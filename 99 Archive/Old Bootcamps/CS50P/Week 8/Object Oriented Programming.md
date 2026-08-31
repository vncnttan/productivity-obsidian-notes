New thing to learn:

# Class
Class is a *custom data type*
``` python
Class_and_object
Class Student:
	...

def main():
	inputted_student = get_student()
	print(inputted_student.name + " is in house " + inputted_student.house)

def get_student():
	# Making a student object
	student = Student()
	student.name = input("Name: ")
	student.house = input("House: ")
```
To declare the variable inside of those classes you need to use **instance method**, more on that later. Without it you can make a new variable all you want in the object

# Object
So, class is sort of the blueprint, and object is a variable with that custom data type using that blueprint. 
Just like after you including scanner package that is filled with scanner class, you can make a scanner object in Java that have a functionality. It's not the class doing the work for you, the variable (object) is.

*You create object from a class*
Class = mold
Object = incarnation/instantiation (instances)

`student.name` is a variable `name` that is inside of the object `student`, whose type is `Student`.

Variable inside of an object is called `attributes` or technically called `instance variables`.
# Method 
What's unique with object, you can get more functionality inside of the student object. With classes you can standardize the variables inside of the object (To guarantee that the user input one of the houses 'Ravenclaw' or 'Slytheryn' or 'Hufflepuff' for example, and rejects if user maliciously type any other).

You can also made a *function* instead of variables inside of an object (by using classes).

## `__init__`
Passing in arguments to the function class, standardizing how to pass value to the object and also enable error checking etc with more code:
``` python
Method
Class Student:

	# When this student class is called, they expect another two variables, one for the name and one for the classes.
	def __init__(self, name, house):
	
		# Make the attribute for said object, self.name is just like student.name
		self.name = name
		self.house = house

def main(): 
	inputted_student = get_student()
	print(inputted_student.name + " is in house " + inputted_student.house)

def get_student():
	# Making a student object
	name = input("Name: ")
	house = input("House: ")
	# A constructor
	student = Student(name, house)
	return student
```

Classes come with methods inside of them that you can define and they behave in a special way

`__init__` is an instance method. If you want to initialize the content of the object of the class, you have to use this method.

`self` gives you an access to an object that is just created.

`student = Student(name, house)` is a constructor, it constructs a Student object with name *student*. With initially nothing inside of it, no name, or house but the object exist first. Before the computer run a method to modify the object, but the computer, automatically call the init method inside of said classes to run after the object is created.

## Build a functionality inside of the object fundamentally
``` python
Checking_student
Class Student:
	def __init__(self, name, house):
		if not name:
			raise ValueError("Missing name")
		if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]
		self.name = name
		self.house = house

def main(): 
	student = get_student()
	print(inputted_student.name + " is in house " + inputted_student.house)

def get_student():
	# Making a student object
	name = input("Name: ")
	house = input("House: ")
	try:
		return Student(name, house)
	except ValueError:
		# Do something if error raised
```

`raise` is a function to create your own exceptions to alert that there's an error

Now, you have a little more control on what to put inside of said object (hard to do on something like a dict or list) 
## `__str__`
Special method in python that will be automatically called any time other function wants to access that object in string.
``` python
__str__
Class Student:
	def __init__(self, name, house):
		if not name:
			raise ValueError("Missing name")
		if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]
		self.name = name
		self.house = house
	# Called when print	
	def __str__(self):
		return f"{self.name} is in house {self.house}"

def main(): 
	student = get_student()
	# Print expects a string for their parameter
	print(student)

def get_student():
	name = input("Name: ")
	house = input("House: ")
	return Student(name, house)
```
## Create your own method
When a function is inside of a class, it's called method
``` python
patronus_method

Class Student:
	def __init__(self, name, house, patronus):
		if not name:
			raise ValueError("Missing name")
		if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]
		self.name = name
		self.house = house
		
	def __str__(self):
		return f"{self.name} is in house {self.house}"
		
	# Self is always added by convention even tho you dont plan to use it
	def charm (self):
		match self.patronus:
			case "Stag":
				return "🐴"
			case "Otter":
				return "🦦"
			case "Jack Russell terrier":
				return "🐕"
			case _:
				return "⬛"

def main(): 
	student = get_student()
	# Print expects a string for their parameter
	print("Expecto Patronum!")
	print(student.charm())

def get_student():
	name = input("Name: ")
	house = input("House: ")
	patronus = input("Patronus: ")
	return Student(name, house, patronus)
```
## Properties and Decorators

Properties is a more defensed and more controlled attribute
`@property`

Decorators is a function that modify the behaviour of other functions.
Require that in order to access an attribute, you go through some function (The getter and setter).
``` python
Properties_and_decorators

Class Student:
	def __init__(self, name, house):
		self.name = name
		self.house = house

	def __str__(self):
		return f"{self.name} is in house {self.house}"

	@property
	def name(self):
		return self._name

	@name.setter
	def name(self, name):
		if not name:
			raise ValueError("Missing name")
		self._name = name

	# Getter
	@property
	def house(self):
		return self._ house
		
	# Setter
	@house.setter	
	def house(self, house):
		if house not in ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"]
			raise ValueError("Invalid House")
		self._house = house
		
def main(): 
	student = get_student()
	# Print expects a string for their parameter
	print(student)

def get_student():
	name = input("Name: ")
	house = input("House: ")
	return Student(name, house)
```
With getter and setter you don't need to add again error checking on the initial method.
By convention, the instance variable is `_house` but the properties is `house`. Both of them need to be different so py doesn't confuse one with the other.

But this means we make a new vulnerable instance variable to`_house`..., the properties is now protected (house), but the instance variable inside of it still is.


It turns out that all of the data type that we uses these far is a class *surprised pikachu face*

# Class Methods

Different from an instance method, the functionality of class methods is the same for every object it created. Some functionality/action associated with the class itself.
`@classmethod`
class method that don't have the self parameter, but instead know what class they're inside in.

Class method and class variable is instant method and instant variable but without its needs to assign to an object. The class itself become an object.

Class method can be called without the need for you to instantiating an object.

Other features:
- [ ] Static Methods

# Inheritance

Borrow other classes methods
Classes that inherit from a superclass will get the superclass's attribute
``` python
class Wizard():
	def __init__(self, name):
		if not name:
			raise ValueError
		self.name = name

class Student(Wizard):
	def __init__(self, name, house):
		super().__init__(name)
		self.house = house
```