### Introduction
React akan memcah bagian-bagian per komponennya: 
Komponen akan dibagi menjadi banyak state, yaitu komponennya, jika ada satu komponen yang berubah, dia bakal bandingin sama anaknya, nanti dia bakal tambahin, lalu re render data yang di dalem komponen tersebut aja 

Public itu digunakan untuk asset static, bisa juga diakses
src: untuk tempat koding
package-lock: versi2 semuanya
package.json: buat install library baru nanti dia bakal muncul di sini
	script: buat jalaninnya

React js itu bakal ada rootnya
Entry point: Root public -> index.html yang div id root

Komponen itu function yang return HTML
export default...

Pastiin dia punya satu parent pas return

## Basic Hello world
``` js
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div>Hello World</div>
  );
}

export default App;
```
Ganti extension jadi jsx biar ada autocomplete dari HTML nya

Tapi walaupun variabelnya keganti dia ga ke render ulang jadi ga muncul di webnya kecuali kita console.log

## Use State
Use state digunakan untuk nyimpen semua variabel dkk
``` js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  // let counter = 1;
  let [counter, setCounter] = useState(0);
  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }
  return (
    <div>
      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}
export default App;
```
pakai Use State biar dia bisa re render ulang

## Map
Jadi kita bisa langsung tampilin semua data yang ada di suatu array
```js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let peoples = [{
    name : "BW 22-1🧑‍💻",
    age : 17
  }, {
    name : "TD 22-1💢",
    age : 17
  }, {
    name : "NJ 23-1🍒",
    age : 17
  }, {
    name : "XD 23-1🙀",
    age : 17
  }, {
    name : "SN 23-1💋",
    age : 17
  }]

  return (
    <div>
      {
        peoples.map((people, index)=>{
          return <div>
            <p>{people.name} - {people.age}</p>
          </div>
        })
      }
      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;
```


## Conditional Ternary
``` js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let peoples = [{
    name : "BW 22-1🧑‍💻",
    age : 22
  }, {
    name : "TD 22-1💢",
    age : 17
  }, {
    name : "NJ 23-1🍒",
    age : 21
  }, {
    name : "XD 23-1🙀",
    age : 20
  }, {
    name : "SN 23-1💋",
    age : 24
  }]

  return (
    <div>
      {
        peoples.map((people, index)=>{
          return (
          <div style={{
            backgroundColor: people.age < 21 ? "red" : "green",
          }}>
            <p>{people.name} - {people.age}</p>
          </div>
          
          );
        })
      }
      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;
```

## Make a component
New component in components/card/PeopleCard
```js 
// app.jsx
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import PeopleCard from './components/card/PeopleCard';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let peoples = [{
    name : "BW 22-1🧑‍💻",
    age : 22
  }, {
    name : "TD 22-1💢",
    age : 17
  }, {
    name : "NJ 23-1🍒",
    age : 21
  }, {
    name : "XD 23-1🙀",
    age : 20
  }, {
    name : "SN 23-1💋",
    age : 24
  }]

  return (
    <div>
      {
        peoples.map((people, index)=>{
          return <PeopleCard people={people} index="a" />;
        })
      }
      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;

// components/card/PeopleCard.jsx
export default function PeopleCard({ people }, { index }){
    return (
        <div style={{
            backgroundColor: people.age < 21 ? "red" : "green",
          }}>
            <p>{people.name} - {people.age} {index}</p>
        </div>
    )
}
```

## More than one variable
```js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import PeopleCard from './components/card/PeopleCard';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let peoples = [{
    name : "BW 22-1🧑‍💻",
    age : 22
  }, {
    name : "TD 22-1💢",
    age : 17
  }, {
    name : "NJ 23-1🍒",
    age : 21
  }, {
    name : "XD 23-1🙀",
    age : 20
  }, {
    name : "SN 23-1💋",
    age : 24
  }]

  return (
    <div>
      {
        peoples.map((people, index)=>{
          // return <PeopleCard people={people} index={index} />;
          return <PeopleCard people={people} index={index} />;
        })
      }
      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;

// People card
export default function PeopleCard(props){
    return (
        <div style={{
            backgroundColor: props.people.age < 21 ? "red" : "green",
          }}>
            <p>{props.people.name} - {props.people.age} {props.index}</p>
        </div>
    )
}
```

Functional component huruf besar
### Metode 1
Buat variabel name dan age sendiri sebelum dimasukkin
``` js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import PeopleCard from './components/card/PeopleCard';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let handleSubmit = (e)=>{
    e.preventDefault();

    setPeoples([...peoples, people]);
  };

  // Metode 1
  let [name, setName] = useState("");
  let [age, setAge] = useState(0);

  let [peoples, setPeoples] = useState(
    [{
      name : "BW 22-1🧑‍💻",
      age : 22,
    }, {
      name : "TD 22-1💢",
      age : 17,
    }, {
      name : "NJ 23-1🍒",
      age : 21,
    }, {
      name : "XD 23-1🙀",
      age : 20,
    }, {
      name : "SN 23-1💋",
      age : 24,
    }]
  );

  return (
    <div>
      {
        peoples.map((people, index)=>{
          // return <PeopleCard people={people} index={index} />;
          return <PeopleCard people={people} index={index} />;
        })
      }

      <form onSubmit={handleSubmit}>
        <input 
          type="text" 
          value={people.name} 
          onChange={(e)=>setPeople(
            {...people, name : e.target.value}
            )}
        /> <br />
        <input 
          type="number" 
          value={people.age} 
          onChange={(e)=>setPeople(
            {...people, age: e.target.value}
            )}
        /> <br />

        <button style={{
          backgroundColor: "green",
        }}> Add new People </button>
      </form>

      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;

```
### Metode 2
```js
import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import PeopleCard from './components/card/PeopleCard';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let handleSubmit = (e)=>{
    e.preventDefault();

    setPeoples([...peoples, people]);
  };

  let [peoples, setPeoples] = useState(
    [{
      name : "BW 22-1🧑‍💻",
      age : 22,
    }, {
      name : "TD 22-1💢",
      age : 17,
    }, {
      name : "NJ 23-1🍒",
      age : 21,
    }, {
      name : "XD 23-1🙀",
      age : 20,
    }, {
      name : "SN 23-1💋",
      age : 24,
    }]
  );

  // Refactor
  let [people, setPeople] = useState({
    name: "",
    age: 0
  });

  return (
    <div>
      {
        peoples.map((people, index)=>{
          // return <PeopleCard people={people} index={index} />;
          return <PeopleCard people={people} index={index} />;
        })
      }

      <form onSubmit={handleSubmit}>
        <input 
          type="text" 
          value={people.name} 
          onChange={(e)=>setPeople(
            {...people, name : e.target.value}
            )}
        /> <br />
        <input 
          type="number" 
          value={people.age} 
          onChange={(e)=>setPeople(
            {...people, age: e.target.value}
            )}
        /> <br />

        <button style={{
          backgroundColor: "green",
        }}> Add new People </button>
      </form>

      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;
```

### Use Effect and Method 3

Use effect, setiap kali variabelnya ke update, dia bakal kepanggil
```js
import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';
import PeopleCard from './components/card/PeopleCard';

function App() {
  // let counter = 1;

  let [counter, setCounter] = useState(0);

  let incrementCounter = () => {
    counter++;
    setCounter(counter);
    console.log(counter);
  }

  let handleSubmit = (e)=>{
    e.preventDefault();

    setPeoples([...peoples, people]);
  };

  let [peoples, setPeoples] = useState(
    [{
      name : "BW 22-1🧑‍💻",
      age : 22,
    }, {
      name : "TD 22-1💢",
      age : 17,
    }, {
      name : "NJ 23-1🍒",
      age : 21,
    }, {
      name : "XD 23-1🙀",
      age : 20,
    }, {
      name : "SN 23-1💋",
      age : 24,
    }]
  );

  // Refactor
  let [people, setPeople] = useState({
    name: "",
    age: 0
  });

  let handleOnChange = (e) =>{
    setPeople({...people, [e.target.name]: e.target.value})
  }

  useEffect(()=>{
    console.log("Ada orang baru!");
  }, [peoples, counter]);

  return (
    <div>
      {
        peoples.map((people, index)=>{
          // return <PeopleCard people={people} index={index} />;
          return <PeopleCard people={people} index={index} />;
        })
      }

      <form onSubmit={handleSubmit}>
        <input 
          type="text" 
          name="name"
          value={people.name} 
          onChange={handleOnChange}
        /> <br />
        <input 
          type="number" 
          name="age"
          value={people.age} 
          onChange={handleOnChange}
        /> <br />

        <button style={{
          backgroundColor: "green",
        }}> Add new People </button>
      </form>

      <div>Hello World {counter} </div>
      <button onClick={incrementCounter}>+</button>
    </div>
  );
}

export default App;

```