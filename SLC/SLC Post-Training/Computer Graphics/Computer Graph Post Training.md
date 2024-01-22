Dokumentasi: threejs.org

1. Buat html dan index js
2. Buat script di head untuk connect ke index js dengan type module
3. Cuman bisa di open with live server

1. Renderer - untuk object kita ------------- (WebGLRenderer)
2. scene - untuk canvas kita ---------------- (Scene)
3. camera - untuk sudut pandang kita
   - persCam (perspective camera
			fov - Field of View, jarak berapa panjang
			ratio - Lebar layar -> width 
			near - Jarak terdekat yang bisa dilihat
			far - Jarak pandang terjauh
   - orthoCam (orthodox Cam)

### Cara buat canvas THREEJS 
1. Import dulu di index dari three.module.js
2. buat ketiga var tersebut dan dimasukkin valuenya
3. set sizenya
4. masukkin ke child html renderernya
5. terus tinggal di render
6. Kurangin margin sama paddingnya

```js
import * as THREE from './three.js/build/three.module.js'

var scene, renderer, camera;

renderer = new THREE.WebGLRenderer();
scene = new THREE.Scene();
camera = new THREE.PerspectiveCamera();

var FOV = 45;
var ratio = window.innerWidth / window.innerHeight;
var near = 1;
var far = 1000;

camera = new THREE.PerspectiveCamera(FOV, ratio, near, far);
renderer.setSize(window.innerWidth, window.innerHeight);

document.body.appendChild(renderer.domElement);

renderer.render(scene, camera);
```
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="index.js" type="module"></script>
    <title>Document</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
    </style>
</head>
<body>
    
</body>
</html>
```


Re render untuk setiap resize
``` js
window.onresize = () => {
    let width = window.innerWidth;
    let height = window.innerHeight;
    renderer.setSize(width, height);
    camera.aspect = width / height
    camera.updateProjectionMatrix()
}
```

Ganti warna canvas
```js
renderer.setClearColor(0xff0000)
```

bikin object 3d abis itu dimasukkin ke canvas kita
```js
let boxGeo = new THREE.BoxGeometry()
let boxMaterial = new THREE.MeshNormalMaterial()

let boxMesh = new THREE.Mesh(boxGeo, boxMaterial)
scene.add(boxMesh)
```

Camera position (x, y, z)
x -> (+)kiri (-)kanan
y -> (+)atas (-)bawah
z -> (+)depan (-)belakang
secara default 0, 0, 0

Camera lookAt -> masukkin aja target looknya bakal kemana
``` js
camera = new THREE.PerspectiveCamera(FOV, ratio, near, far);
camera.position.set(0, 10, 10) // x, y, z
camera.lookAt(0, 0, 0 )
```

Biar setiap kali kita resize, dia render ulang, di window on resize tambahin
`renderer.render(scene, camera)`

Anti alias biar dia ga patah2
```js
renderer = new THREE.WebGLRenderer({
    antialias: true
});
```


### pert3
// 2D object ------------ point, line, plane

- Geometry - Kerangka
- Material - bhn untuk bikin kerangka
- mesh - gabungin geometri sama mat

```js
let vertex = [
    new THREE.Vector2(3, 3),
    new THREE.Vector2(3, -3),
    new THREE.Vector2(-3, 3),
    new THREE.Vector2(-3, -3)
]

var createPoints = (vertex) => {
    let bufferGeometry = new THREE.BufferGeometry().setFromPoints(vertex); 
    let pointMaterial = new THREE.PointsMaterial()
    let points = new THREE.Points(bufferGeometry, pointMaterial)
    return points
}

scene.add(createPoints(vertex))
```

## Orthodox Camera
```js
var viewSize = 10
var left = viewSize * ratio / -2
var right = viewSize * ratio / 2
var top = viewSize / 2
var bottom = viewSize / -2

camera = new THREE.OrthographicCamera(
    left, 
    right,
    top,
    bottom,
    near,
    far
)
```

### Untuk liat perbandingannya pake wireframe
```js
let boxGeo = new THREE.BoxGeometry()
let boxMaterial = new THREE.MeshNormalMaterial({
    wireframe : true
})
```

### Making a line
``` js
var createLines = (vertex) => {
    let bufferGeometry = new THREE.BufferGeometry().setFromPoints(vertex);
    let lineMaterial = new THREE.LineBasicMaterial();
    let line = new THREE.LineLoop(bufferGeometry, lineMaterial)
    return line;
}

scene.add(createLines(vertex))
```

### Making a Plane
Perlu diajarin juga:
- side
- ketebalan planenya 
```js
var createPlane = (vertex) => {
    let planeGeometry = new THREE.PlaneGeometry(1, 1)
    let planeMaterial = new THREE.MeshNormalMaterial({
	    // biar dia sisi depan belakang keliatan
        side: THREE.DoubleSide
    })
    let planeMesh = new THREE.Mesh(planeGeometry, planeMaterial)
    // planeMesh.set(20, 20, 20)
    planeMesh.position.x = 20
    planeMesh.position.y = 20
    planeMesh.position.z = 20
    return planeMesh
}

scene.add(createPlane(vertex))
``` 

### Pertemuan 4 - Creating 3D Shapes
Create Box
```js
var createBox = () => {
    let boxGeo = new THREE.BoxGeometry(1, 1)
    let boxMaterial = new THREE.MeshNormalMaterial()
    let boxMesh = new THREE.Mesh(boxGeo, boxMaterial)
    return boxMesh
} 

scene.add(createBox())
```

Create Cone
```js
var createCone = () => {
    let coneGeo = new THREE.ConeGeometry(1, 1, 64, 1)
    let coneMaterial = new THREE.MeshNormalMaterial()
    let coneMesh = new THREE.Mesh(coneGeo, coneMaterial)
    return coneMesh
}

scene.add(createCone())
```
Kalau mau open ended, jadiin open ended (parameter ke 4 buat jadi -1)

Animasi cone
```js
var createCone = () => {
    let coneGeo = new THREE.ConeGeometry(1, 1, 64, 1)
    let coneMaterial = new THREE.MeshNormalMaterial({
        side: THREE.DoubleSide
    })
    let coneMesh = new THREE.Mesh(coneGeo, coneMaterial)
    return coneMesh
}

var meshCone = createCone()
scene.add(meshCone)
let renderFunction = () => {
    renderer.render(scene, camera)
    meshCone.rotation.x += 0.01
    meshCone.rotation.y += 0.01
    meshCone.rotation.z += 0.01
    requestAnimationFrame(renderFunction)
}
```

Ga nemu: fade in/fade out

Sphere
```js
var createSphere = ()=>{
    let sphereGeo = new THREE.SphereGeometry(1, 64, 64)
    let sphereMaterial = new THREE.MeshNormalMaterial()
    let sphereMesh = new THREE.Mesh(sphereGeo, sphereMaterial)
    return sphereMesh
}

var sphereMesh = createSphere()
scene.add(sphereMesh)
```

Animation Sphere
```js
let renderFunction = () => {
    renderer.render(scene, camera)

    sphereMesh.position.y += 0.01
    requestAnimationFrame(renderFunction)
}
```

Cylinder
```js
var createCylinder = () => {
    let cylinderGeo = new THREE.CylinderGeometry()
    let cylinderMaterial = new THREE.MeshNormalMaterial()
    let cylinderMesh = new THREE.Mesh(cylinderGeo, cylinderMaterial)
    return cylinderMesh
}

var cylinderMesh = createCylinder()
scene.add(cylinderMesh)
```

Wireframe
```js
di dalem createCylinder
    let wireFramGeo = new THREE.WireframeGeometry(cylinderGeo)
    let wireLine = new THREE.LineSegments(wireFramGeo);
    wireLine.position.z += 2
    scene.add(wireLine)
```

### Pertemuan 6 - Material
- meshNormalMaterial = Material buat debug, karena tiap sisi dikasih warna berbeda
- meshBasicMaterial = material yang tidak memerlukan cahaya
- meshPhongMaterial = material yang memerlukan cahaya (licin)
- meshLambertMaterial = material yang memerlukan cahaya (ga mantulin cahaya)
- meshStandardMaterial = material yang memerlukan cahaya (campuran)
Basic
```js
var createBoxBasic = () => {
    let boxGeo = new THREE.BoxGeometry(1, 1)
    let boxMaterial = new THREE.MeshBasicMaterial()
    boxMaterial.color = new THREE.Color(125, 125, 0)
    let boxMesh = new THREE.Mesh(boxGeo, boxMaterial)
    return boxMesh
} 
scene.add(createBoxBasic())
```

Cahaya:
- ambientLight | Cahaya universal
  ```js
let ambientLight = new THREE.AmbientLight(0xffffff, 1)
scene.add(ambientLight)
```
- pointLight (+helper)
  ```js
  let pointLight = new THREE.PointLight(0xffffff, 1, 100)
  let pointLightHelper = new THREE.PointLightHelper(pointLight) 
  scene.add(pointLight)
  scene.add(pointLightHelper)
  ```
- spotLight (+helper)
  ```js
  let spotLight = new THREE.SpotLight(0xffffff, 1000, 1, Math.PI/6)
  let spotLightHelper = new THREE.SpotLightHelper(spotLight)
  spotLight.rotation.x = Math.PI/4
  scene.add(spotLight)
  scene.add(spotLightHelper)
```
- directionalLight (+helper)
  ```js
  let directionalLight = new THREE.DirectionalLight(0xfffff, 10)
	let directionalHelper = new THREE.DirectionalLightHelper(directionalLight)
	directionalLight.target = box
	directionalLight.position.x += 3
	scene.add(directionalLight)
	scene.add(directionalHelper)
	let velocity = 0.01
```


### Texture Loader
```js
var createBoxTextured = () => {
    let boxGeo = new THREE.BoxGeometry(1, 1)
    let boxMaterial = new THREE.MeshBasicMaterial()
    let loader = new THREE.TextureLoader().load('./Assets/assets.jpeg')
    let loader1 = new THREE.TextureLoader().load('./Assets/nmap.jpeg')

    boxMaterial = new THREE.MeshLambertMaterial({
        map: loader,
        normalMap: loader1
    })


    let boxMesh = new THREE.Mesh(boxGeo, boxMaterial)
    return boxMesh
} 
```

notes. liat intensity dan warna dari lampu

### MeshPhong
Specular: Warna yang dipantulin
Shininess: Pantulan

```js
var createBoxStandard = () => {
    let boxGeo = new THREE.BoxGeometry(1, 1)
    let boxMaterial = new THREE.MeshBasicMaterial()
    let loader = new THREE.TextureLoader().load('./Assets/assets.jpeg')
    let loader1 = new THREE.TextureLoader().load('./Assets/nmap.jpeg')

    boxMaterial = new THREE.MeshStandardMaterial({
        roughness: 0,
        metalness: 1,
        map: loader,
        normalMap: loader1
    })


    // boxMaterial.color = new THREE.Color(125, 125, 0)
    let boxMesh = new THREE.Mesh(boxGeo, boxMaterial)
    return boxMesh
} 
let box = createBoxStandard()
```

MeshBasic gabisa nerima shadow - plane dan boxnya harus phong lambert atau standard

`renderer.shadowMap.enabled = true;renderer.shadowMap.enabled = true;`
`    planeMesh.receiveShadow = true;`
`    boxMesh.castShadow = true;`

``` js
var createPlane = (vertex) => {
    let planeGeometry = new THREE.PlaneGeometry(5, 5)
    let planeMaterial = new THREE.MeshPhongMaterial({
        side: THREE.DoubleSide,
        color: 0xaaaa00
    })
    let planeMesh = new THREE.Mesh(planeGeometry, planeMaterial)
    planeMesh.position.y = -1
    planeMesh.rotation.x = Math.PI/2
    planeMesh.receiveShadow = true;
    return planeMesh
}
```

# Pertemuan 6 - Font
```js
var createFont = () => {
    let font= new FontLoader().load("./three.js/examples/fonts/gentilis_bold.typeface.json", function(font) {
        let fontGeo = new TextGeometry('Hello', {
            font: font,
            size: 1,
            height: 1
        })
        fontGeo.center()
        let fontMaterial = new THREE.MeshNormalMaterial()
        let fontMesh = new THREE.Mesh(fontGeo, fontMaterial)
        scene.add(fontMesh)
    })
}
createFont()
```


### Orbit Controls
```js
import {OrbitControls} from './three.js/examples/jsm/controls/OrbitControls.js'
var control = new OrbitControls(camera, renderer.domElement)
control.update()
```

### Event Handling
```js
window.addEventListener('mousedown', (e)=>{
    console.log(e)
})
```

Ganti kamera kalau klik spasi
```js
camera = new THREE.PerspectiveCamera();


var camera2, currentCamera

var FOV = 45;
var ratio = window.innerWidth / window.innerHeight;
var near = 1;
var far = 1000;

camera = new THREE.PerspectiveCamera(FOV, ratio, near, far);
currentCamera = camera

var viewSize = 10
var left = viewSize * ratio / -2
var right = viewSize * ratio / 2
var top = viewSize / 2
var bottom = viewSize / -2

camera2 = new THREE.OrthographicCamera(
    left, 
    right,
    top,
    bottom,
    near,
    far
); 

camera.position.set(10, 10, 10) // x, y, z
camera.lookAt(0, 0, 0 )

window.addEventListener('keydown', (e)=>{
    if(e.key == ' '){
        if(currentCamera == camera){
            currentCamera = camera2
        } else {
            currentCamera = camera
        }
    }
})

renderer.render(scene, currentCamera)
```


### Raycast Pertemuan 8
```js
var rayCast = new THREE.Raycaster()
var pointer = new THREE.Vector2()

window.addEventListener("pointerdown", (e)=>{
    pointer.x = (e.clientX / window.innerWidth) * 2 - 1;
    pointer.y = - (e.clientY / window.innerHeight) * 2 + 1
    rayCast.setFromCamera(pointer, currentCamera)

    let intersects = rayCast.intersectObjects(scene.children)

    for(let i = 0; i<intersects.length; i++){
        console.log(intersects[i])
        intersects[i].object.position.x += 1
    }
})

```

Conditional Raycasting
```js
... di planeMesh
    planeMesh.name = 'Hans';
...


... di addEventListener
		if(intersects[i].name == 'Hans'){
            intersects[i].object.position.y += 1
        } else {
            intersects[i].object.position.x += 1
        }
...
```

### GLTF Model
Ambil model dari sketchfab.com
```js
import {GLTFLoader} from './three.js/examples/jsm/loaders/GLTFLoader.js'
var gltfloader = new GLTFLoader().load('./Assets/phoenix_bird/scene.gltf', (object)=>{
    let model = object.scene
    model.scale.set(0.01, 0.01, 0.01)
    scene.add(model)
})
```

Animation
``` js
var clock = new THREE.Clock()
var gltfloader = new GLTFLoader().load('./Assets/phoenix_bird/scene.gltf', (object)=>{
    let model = object.scene
    model.scale.set(0.01, 0.01, 0.01)

    let animation = object.animations[0]
    let mixer = new THREE.AnimationMixer(model)
    let action = mixer.clipAction(animation)

    action.play()
    
    function animate(){
        let delta = clock.getDelta()
        requestAnimationFrame(animate)
        mixer.update(delta)
    }
    animate()
    
    scene.add(model)
})
```

### Pertemuan 11 - Skybox
Aturan urutan skybox: +x -x +y -y +z -z
```js
let textureLoader = new THREE.TextureLoader()
let boxMaterialArr = [
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_right.jpg'),
        side: THREE.DoubleSide
    }),
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_left.jpg'),
        side: THREE.DoubleSide
    }),
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_top.jpg'),
        side: THREE.DoubleSide
    }),
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_bottom.jpg'),
        side: THREE.DoubleSide
    }),
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_front.jpg'),
        side: THREE.DoubleSide
    }),
    new THREE.MeshBasicMaterial({
        map: textureLoader.load('./Assets/skybox/daylight_box_back.jpg'),
        side: THREE.DoubleSide
    })]

let skyGeo = new THREE.BoxGeometry(1000, 1000, 1000)
let skyBox = new THREE.Mesh(skyGeo, boxMaterialArr)
scene.add(skyBox)
```