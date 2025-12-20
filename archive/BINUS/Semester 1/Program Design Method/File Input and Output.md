To save data for later purposes, we use file. So far, after we execute the program, the data gets lost. But, with writing it onto a file, you can save data that was entered before

End of the file is mark by the EOF Marker

Types of files :
[[Text files (txt)]]
[[Binary file]]

[[Pseudocode]]
---

1. Declaring
`Declare OutputFile CustomerFile`
`Open customerFile "customers.dat"`

2. Writing
`Write customerFile "Charles Pace"`
or
`Declare String name = "Charles Pace"`
`Write customerFile name`

3. Close
`Close customerFile`

4. Reading
`Read inventoryFile itemName`