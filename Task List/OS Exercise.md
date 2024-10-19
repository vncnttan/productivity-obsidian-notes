1. Bagian proses mana yang akan berhubungan langsung dengan CPU?
2. Jelaskan perbedaan preemptive dan non-preemptive! Berikan contohnya
3. Berikan kelebihan dan kekurangan dari masing-masing algoritma penjadwalan nomor 4a
4. Diberikan sebuah process table:
   ![[Pasted image 20241019112402.png]]
   a. Simulasikan dengan menggunakan Gantt Chart penjadwalan proses di tabel dengan menggunakan algoritma:
	   - First Come First Serve
	   - Shortest Process Next (SPN)
	   - Shortest Remaining Time (SRT)
	   - Round-Robin, q=4

   b. Hitung rata-rata masing-masing waiting time untuk keempat algortima tersebut

---

> Vincent Tanjaya
> 2602128346

### 1. Process that **connects directly to CPU** 
***CPU Burst*** is a period which a process/program demans and actively utilizes the CPU for computation. CPU executes a sequence of instructions for a specific task. In contrary *I/O Burst* is a period in which a process/program waits for the data to be read from written to external services, such as devices/network sources.
   
Reference: [CPU and I/O Burst Cycles | Baeldung on Computer Science](https://www.baeldung.com/cs/cpu-io-burst-cycles)

### 2. **Preemptive** vs. **Non-preemptive** Scheduling 
**Preemptive scheduling** is used when:
   - Process switches from the running state to the ready state 
   - Process switches from the waiting state to the ready state
So the process are assigned a particular time, and then removed. If the resources still have the remaining CPU burst time, the process is placed back in the ready queue, until given a chance to execute again.
   
**Non-Preemptive scheduling** is used when:
   - Process switches from the running state to the waiting state
   - Process terminates
So the assigned processes will keep running until it is eliminated or reaches a waiting state. When other processes with higher priority comes, it does not interrupt the currently running state, but waits until the currently state terminates or enter a waiting state.

| ==**Preemptive schedule**==                                                                                    | ==**Non-Preemptive schedule**==                                                                                         |
| -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| A processor can be preempted to execute the different processes in the middle of any current process execution | Once the processor starts its execution, it must finish it before executing the other. It can’t be paused in the middle |
| More flexible                                                                                                  | More rigid                                                                                                              |
| More efficient compared to non-preemptive scheduling                                                           | Less efficient                                                                                                          |
| Less waiting and response time                                                                                 | More waiting and response time                                                                                          |
| Has the overhead of switching the process from the ready state to the running state and vice-versa             | Has no overhead of switching the process from running into  the ready state                                             |
| Examples are Round Robing (RR) and Shortest Remaining Time First                                               | Examples are First Come First Serve (FCFS) and Shortest Job First                                                       |

   References: [Difference Between Preemptive and Non-Preemptive Scheduling - YouTube](https://www.youtube.com/watch?v=UlpgVptO5Gk), [Difference between Preemptive and Non-Preemptive Scheduling - javatpoint](https://www.javatpoint.com/preemptive-vs-non-preemptive-scheduling), [Preemptive and Non-Preemptive Scheduling - GeeksforGeeks](https://www.geeksforgeeks.org/preemptive-and-non-preemptive-scheduling/)

#### 3. **Strength and Weaknesses** for each scheduling algorithm:
##### First Come First Serve (FCFS)
**Strength**:
- Simple and easy to understand
- Provides fairness by treating all processes equally and giving them equal oportunity to run
- Guarantees that every process will eventually get a chance to execute
- Low scheduling overhead
- Well suited for long-running processes or workloads that do not have strict time constraints

**Weakness**:
- Process with less execution time suffers (i.e. waiting time is often quite long)
- Favors CPU bound process the I/O bound process
- Other processes might wait unnecessarily if process that has a large burst time comes first. This will result in more average waiting time (Convoy Effect)

##### Shortest Process Next (SPN)
**Strength**:
- Shortest Process are favored
- Probably optimal, gives the minimum average waiting time for a given set of processes

**Weakness**:
- May cause starvation if shorter processes keep coming (the longer processes will not get executed for a long time, until the shorter processes stop coming)
- Cannot be implemented at the level of short-term CPU scheduling

##### Shortest Remaining Time (SRT)
**Strength**:
- Guarantees lower average waiting time
- More efficient memory usage, as libraries can be shared among multiple instances of the program
- Provides better portability, as the program can be executed on different systems with compatible libraries available at runtime.

**Weakness**:
- May cause starvation if a process deemed will take too long
- Hard to implement (pre-emptive scheduling are hard too implement in general, because it needs a lot of thoughts and overhead for switching in between task)
- Debugging can be more complex because there will be more libraries at runtime
- Consume more CPU time for processing the context switching in between tasks.


##### Round Robin (RR)
**Strength**:
- Every process gets an equal time-slice share of the CPU, ensuring fairness among all processes
- Cyclical in nature, so there is no starvation
- Suitable for interactive system and time-sharing systems

**Weakness**:
- Setting the quantum too short increases the overhead and lowers the CPU efficiency, but setting it too long causes poor response to short processes
- Average waiting time is not optimal
   
   References: [Advantages and Disadvantages of various CPU scheduling algorithms - GeeksforGeeks](https://www.geeksforgeeks.org/advantages-and-disadvantages-of-various-cpu-scheduling-algorithms/), [Introduction of Shortest Remaining Time First (SRTF) algorithm - GeeksforGeeks](https://www.geeksforgeeks.org/introduction-of-shortest-remaining-time-first-srtf-algorithm/)

#### 4. **Process Table** 
##### Gantt Chart Simulation
- First Come First Serve (FCFS)
- Shortest Process Next (SPN)
- Shortest Remaining Time (SRT)
- Round-Robin, q = 4

   a. Simulasikan dengan menggunakan Gantt Chart penjadwalan proses di tabel dengan menggunakan algoritma:
	   - First Come First Serve
	   - Shortest Process Next (SPN)
	   - Shortest Remaining Time (SRT)
	   - Round-Robin, q=4

   b. Hitung rata-rata masing-masing waiting time untuk keempat algortima tersebut

![[Pasted image 20241019190111.png]]
