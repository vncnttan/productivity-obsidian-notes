1. View & Designing Android 
2. Adding adb to path in the environment variables

Drag and drop half 1 ke hp

Root HP nya pakai Root AVD Master

Jadx untuk buka source code

Kalau ada debuggable true tau allow backup true bisa ditaroh di dokumentasi
Untuk lihat bisa coba di cari di google kira-kira permissionnya butuh apa engga

Apktools command line tool yang bisa coba compile dan ngehasilin assembly

Decompile
`apktool d half1.apk`

Otak atik smalinya sambil liat jadx

Compile
`apktool b half1 -o bypass.apk`

Generate key tool
`"C:\Program Files\Java\jdk-11.0.11\bin\keytool.exe" -genkey -v -keystore bypass1.keystore -alias bypass1key -keyalg RSA -keysize 2048 -validity 10000`
password: `bypass1`

Buat apk yang bisa dimasukkin key nya
`"C:\Users\vince\AppData\Local\Android\Sdk\build-tools\34.0.0\zipalign.exe" -p 4 bypass.apk bypassWithKey.apk`

Buat apk yang dimasukkin key nya
`"C:\Users\vince\AppData\Local\Android\Sdk\build-tools\34.0.0\apksigner.bat" sign -ks bypass1.keystore bypassWithKey.apk`


### Dynamic

Pushing ADB Frida to Android (pastiin file frida ada di direktori sama)
`adb push frida-server-16.0.8-android-x86_64 /data/local/tmp/frida-server`

```
adb shell
cd /data/local/tmp
chmod +x frida-server
frida-ps Uai

sekarang bisa buka frida dan harusnya udah ada LAkopedia

```

Klik kanan di JADX, copy as frida snippet
Buat payload.js
```Javascript
Java.perform(()=> {
    let MainActivity = Java.use("com.example.example2app.MainActivity");
    MainActivity["checkRootMethod1"].implementation = function () {
        return false;
    };

    MainActivity["checkRootMethod2"].implementation = function () {
        return false;
    };

    MainActivity["checkRootMethod3"].implementation = function () {
        return false;
    };

    MainActivity["checkLocation"].implementation = function () {
        return true;
    };
})
```


```
Jalanin fridanya
frida -U -l payload.js -f com.example.example2app

## SQL Injection 
' OR 1=1 LIMIT 1 #--

Proxy > Options
Buat interface dengan port bebas
All interfaces

Proxy 
Intercept On

Install SSL Certificate
Proxy > Proxy Settings > Certificate CA in DER options

Masukkin der ke emulatornya

Di Emulator
Settings > Search > Install a certificate > Masukkin certificate der nya

Di proxy, ganti jadi IP PC Computer dengan port yg dibuat di BurpSuite
```