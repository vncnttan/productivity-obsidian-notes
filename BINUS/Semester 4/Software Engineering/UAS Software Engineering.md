I. Essay
## ***1. Version Control and Branch Management***
### Dependency Management
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

[[Types of Dependencies]]
### Version Control System
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

### Branch Management
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
## ***3. Deployment, Maintenance, and Reengineering***

---
II. Case
## ***1. Introduction to Software Architecture and Microservice***
##### Software Engineering for Machine Learning
##### Software Configuration Management
##### Quality Assurance: Automated Testing
##### Ethics and Trends in Software Engineering