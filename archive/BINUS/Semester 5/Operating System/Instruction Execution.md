Basic Instruction Cycle without interruption:

![[Pasted image 20241104152152.png]]

1. Processor read instruction from memory (Fetch)
2. Instruction executed sequentially (Execute stage)

##### Interrupts
Enables processor to execute instructions insequentially so processor work will be more effective. 

> Happened because instructions from I/O device need to be immediately executed!

#### Classes of interrupt:
###### Program Interrupt
Interrupt appears because there is a certain condition after instruction is executed. 
Contoh: Error-error pada program seperti *Division By Zero, Arithmetic Error, Runtime Error, dll.*

###### Timer Interrupt
Interrupt appears caused by a timer that does this in th CPU 
Contoh: Scheduled shut down

###### I/O Interrupt
Interrupt appears caused by an I/O controller
Contoh: Ketika pengguna menekan tombol pada keyboard, keyboard akan mengirim sinyal interupsi ke CPU

###### Hardware Failure Interrupt
Interupsi yang muncul karena ada hardware failure
Contoh: Power Failure atau Disk Error, akan mengirimkan hardware failure interruption ke instruction

![[Pasted image 20241104154439.png]]

