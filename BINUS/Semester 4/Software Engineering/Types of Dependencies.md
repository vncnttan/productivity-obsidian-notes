
1. Transitive Dependency: Dependency yang digunakan **bergantung pada paket lain**
   `a -> b -> c`
   ![[Pasted image 20240701114753.png]]
2. Diamond Dependency: **Problem yang muncul** ketika beberapa dependency memiliki **dependency transitive yang sama**
	``` Diamond Dependency
	 A
	/ \
	B  C
	\ /
	 D
	```
   ![[Pasted image 20240701114905.png]]
   Problem that might appear: Version Conflict
   Resolution:
   - **Duplicate It**: Duplicate for each dependency
   - **Ban Transitive Dependency**: Using 1 global version
   - **Newest Version**: Keeps everything at the latest
   - **Oldest Version**: Lowest Denominator, Sacrifices new Functionality
   - **Oldest non-breaking version / Newest non-breaking version**: Faith in tests or semantic versioning contract

