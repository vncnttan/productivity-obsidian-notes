PC BINUS 

E>Project>PPE Web di copy dlu ke data D:

Kalo misalnya pythonnya di atas 3.7 
Hapus versi django dan numpy nya

CTRL + SHIFT + P > Python Intrepreter > Comp Physics
atau
py -3.7 -m venv environments\computational_physics

Activate BAT
environments\computational_physics\Scripts\activate.bat


For first time running:
python manage.py makemigrations simulations
python manage.py migrate
python manage.py runserver

1. Voltage Source -> Sumber Listrik
2. Resistor -> Penghambat
3. Sumber Listrik -> Capacitor -> Rangkaian kita (menyimpan tegangan listrik/batere)
4. Inductor -> Menstabilkan arus listrik
5. Wire -> Kabel
6. Ammeter -> Mengukur arus litrik
7. Voltmeter -> Mengatur tegangan listrik


# Drawing Circuits Topology
Constraint Design:
! Bikin design yang biar dia bisa looping
![[Pasted image 20230819102809.png]]

Resistor_feeder = parasitive_resistance
Tujuannya, biar kita tahu, setidaknya ada R di variabelnya

### Arah positive polarity
Postitive Polaritynya ke arah setelahnya, dari ammeternya, terus kita edit-edit cellsnya
Ammeter = searah
VoltageSource = searah
Voltmeter = berlawanan 
Capacitor = berlawanan

Katode polarity
Dioda = Searah hasil tegangan positif, berlawanan hasil tegangan negatif

### Parasitve (resistor feeder)
kita jadiin 0.01

### Voltage Source
Volt * sqrt(2) = Peak voltage
Voltage frequency  -> Setiap negara beda, default 60

### Voltage Meter
Rated voltage 

### To run
![[Pasted image 20230819110609.png]]
ammeter 