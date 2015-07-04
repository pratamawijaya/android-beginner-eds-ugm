# android-beginner-eds-ugm
Note for Android Beginner course EDS

Location : EDS Universitas Gajah Mada Indonesia
Time : 4-5 Juli 2015

Based on Udacity Course : https://www.udacity.com/course/android-development-for-beginners--ud837


#Day 1
### Android Studio
- package name diambil dari application name dan domain name
- minimum SDK di set ke versi android 15, berdasarkan data dari dashboard developer (https://developer.android.com/about/dashboards/index.html?utm_source=suzunone) 
- Satu tampilan layout dihandle oleh satu activity.

### Cheatseet
Windows
- Code formating : CTRL+ALT+L
- Open File :

### Gradle
Gradle itu adalah automation build tools digunakan untuk build source project android, etc

### Folder Structure
App
- folder build : berisi hasil generate dari IDE
- libs : folder untuk menyimpan library yang berbentuk .jar
- src : folder dimana source .java dan resource (icon, layout) disimpan
- build.gradle : file konfigurasi untuk module app, konfigurasi terdiri dari, compiled SDK Version, buildtoolsversion, applicationID, dan dependecy atau library yang digunakan untuk module app
- file build.gradle yang terdapat dalam folder app, berisi konfigurasi untuk module app
- file buidl.gradle yang terdapat di root folder digunakan untuk konfigurasi buildscript project dan location repository project
- file setting.gradle digunakan untuk konfigurasi module apa saja yang akan di compile

### Layouting
- match_parent : mengikuti lebar/tinggi dari parent
- wrap_content : mengikuti lebar/tinggi dari content yang ada didalam

### Perbandingan Density
basenya adalah 1dp = 1px pada density layar mdpi jadi jika 48px di mdpi maka akan pada density xxhdpi perlu 144px
```
 mdpi  (1)
 hdpi (1.5)
 xhdpi (2)
 xxhdpi (3)
 xxxhdpi (4)
```

### ViewGroup
- LinearLayout : selalu memiliki orientasi (horizonta dan vertical)
- RelativeLayout : bisa diset view apakah akan dikanan dibawah dikiri dari sebuah view
- layout_weight hanya bisa digunakan pada LinearLayout

# Day 2

### Excercise

Calculator
- simple calc
- berat badan ideal
- suhu
- fisika
- etc.
