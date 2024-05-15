Analisa Builder Car : 

1. Kelas Car: Kelas ini mewakili objek Car dengan properti engine, wheels, color, dan interior. Setiap properti memiliki getter dan setter.

2. Kelas CarBuilder: Kelas ini digunakan untuk membangun objek Car. Metode builder (engine, wheels, color, interior) mengatur properti dari objek Car dan mendukung method chaining.

3. Kelas CarDirector: Kelas ini mengelola pembuatan objek Car dengan konfigurasi tertentu, seperti buildSportsCar, buildSUV, dan buildEconomyCar. Kelas ini menggunakan pola desain Singleton untuk memastikan hanya ada satu instance CarDirector.

4. Kelas Main: Kelas ini mendemonstrasikan cara menggunakan CarBuilder dan CarDirector untuk membangun dan mengkonfigurasi objek Car.