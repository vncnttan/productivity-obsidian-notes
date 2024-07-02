I. Essay
## ***1. Version Control and Branch Management***
##### Dependency Management
	Komponen Eksternal yang dibutuhkan sebuah proyek untuk dibangun atau dijalankan.
	ex. Tailwind, libSSL, zLib, etc.
###### Scope:
- Compile `tensorflow, dll`
- Run `logging, database, jaringan, I/O, gMAPS & Navigation api, Payment Gateway, etc.`
- Test `JUnit, Mock`

###### Dependency Server (how to get external modules/dependencies):
- Maven Central
- Ubuntu Packages
- NPM Public Registry
- Python Package Index (PyPI)

###### [[Types of Dependencies]]
##### Version Control System
	Sistem yang mengombinasikan prosedur dan alat untuk mengelola berbagai versi objek konfigurasi yang dibuat selama proses pengembangan software.
###### Major Capabilities:
- Project Database (Repository): Menyimpan semua **object konfigurasi** yang relevan
	`Github Repository`
- Version Management Capabilities: Menyimpan semua **versi** object konfigurasi
	`Git Commit History & Branching`
- Make Facility: **Mengumpulkan objek konfigurasi** & membangun **versi spesifik** dari software
	`Gradle, Maven, & NPM -> npm install`
- Issues Tracking Capabilities: Memungkinkan tim merekam & melacak status semua masalah terkait dengan objek konfigurasi
	`JIRA & Bugzilla`

###### Change Set:
	Kumpulan dari semua perubahan yang diperlukan untuk membuat versi spesifik software

###### System Modelling, consists of:
- Template that includes a component hierarchy and a "build-order" for the components that describes how the system must be constructed 
- Construction rules
- Verification rules

###### Continuous Integrations
- Best Practice for SCM
	1. Keeping the number of code variant small
	2. Test early and often
	3. Integrate early and often
	4. Tool use to automate testing, building, and code integrations.
- Advantages:
	1. **Accelerated Feedback**: Notify developer when integrations failed
	2. **Increased Quality**: Provides confidence into the quality of developed product
	3. **Reduced Risk**: Integrating component early avoid risking long integration phase
	4. **Improved Reporting**: Providing additional information allows for more accurate configuration status accounting
###### Types of VCS
- Centralized Version Control System (CVCS)
	- Have 1 central repository
	- `ex. Subversion, CVS`
- Distributed Version Control System (DVCS)
	- Every developer have the full copy of the repository
	- `ex. Git, Mercurial`
###### Version Control vs. Dependency Management
- **VCS**: Internal Code
- **Dependency Management**: Managing external dependencies
##### Branch Management
	Ability to detect revision and version control.
###### "One version" rule works best with short-lived branches
	Only one version of a dependency can exist in the entire codebase at a time
###### Git Basic Concept
	- Repository
	- Commit
	- Branch
	- Merge
	- Pull Request
## ***2. Quality Assurance: Static and Dynamic Analysis***
##### Quality Assurance
	Proses in Software Engineering that assure the software quality is on par with the standard
###### Tugas Software Quality Assurance (SQA)
1. Menyiapkan **rencana** SQA untuk project
2. Mengidentifikasi **evaluasi**
3. Menentukan **standar** yang berlaku
4. Menghasilkan **dokumen** yang diperlukan
5. Memberikan **umpan** balik ke tim proyek
6. Meninjau aktivitas **rekayasa** software
7. Mengidentifikasi, mendokumentasikan, dan melacak **penyimpangan** dari proses
8. Melakukan **audit** produk kerja
###### SQA Statistik
 - Mengumpulkan informasi tentang semua kecatatan
 - Menemukan penyebab cacat
 - Menyediakan perbaikan untuk proses
###### Six-Sigma
	6 Standard Deviation implying an extremely high quality standard
###### 5 Steps:
- **Define**
- **Measure**
- **Analyze** 
- **Improve**
- **Control**
###### Software Reliability:
- *Mean Time Between Failure (MTBF)*:
  Semakin tinggi semakin baik ![[Pasted image 20240702091819.png]]
- *Availability*:
  Persentase waktu sistem tersedia untuk digunakan.
  ![[Pasted image 20240702092025.png]]
###### Software Safety
	Activity that focuses on the identification and assesment of potential hazards
###### Static Analysis vs. Dynamic Analysis
- Static Analysis
  Checkin computer code without running it
- Dynamic Analysis
  Checking computer code by doing testing
![[Pasted image 20240702101012.png]]

## ***3. Deployment, Maintenance, and Reengineering***

##### Software Deployment
	Proses membuat perangkat lunak dapat diakses oleh pengguna danb program lain.
###### Strategi Deployment
- **Basic** Deployment
- **Rolling** Deployment
- **Multi-service** Deployment
- **Blue/Green** Deployment
- **Canary** Deployment
- **A/B Testing**
- **Shadow** Deployment
###### Types of Server:
- **Development** Server
  Used for development purposes together
- **Production** Server
  Used for production and can be used by the public
##### Maintenance
	Aktivitas yang dilakukan setelah software dirilis untuk maintenance
###### Maintainable Software
 - Modularitas efektif
 - Penggunaan pola desain
 - Standard coding
 - Teknik QA
##### [[Software Reengineering]]
##### [[Steps of Software Reengineering]]
##### [[Business Process Reengineering]]
---
II. Case
## (Case) ***1. Introduction to Software Architecture and Microservice***
	Struktur fundamental dari sebuah sistem perangkat lunak

- Client Server Architecture
- Monolithic Architecture
- Service Oriented Architecture
- Microservice Architecture
- Serverless Architecture
![[Pasted image 20240702153103.png]]


## (Case) ***2. Software Engineering for Machine Learning***
Steps:
- Model Requirement
- Data Collection
- Data Cleaning
- Data Labelling
- Feature Engineering
- Model Training
- Model Evaluation
- Model Deployment
- Model Monitoring


## (Case) ***3. Software Configuration Management***
	Aktivitas yang diterapkan sepanjang proses perangkat lunak
	

## ***4. Quality Assurance: Automated Testing***
## ***5. Ethics and Trends in Software Engineering***
