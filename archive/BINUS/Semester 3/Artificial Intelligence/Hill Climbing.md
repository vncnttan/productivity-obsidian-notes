  *"Climbing a mountain without a compass"*
  
- Simply continually moves in the direction of increasing value
- Terminates when it reaches the **peak** where no neighbor has a higher value
- Starts with a random solution, and iteratively makes small changes to the solution each time improving its value
- Successors of a node are evaluated and one that give the most improvement is selected
- Choose the successor with the **best solution** (highest value = best solution)
  ![[Pasted image 20230921101403.png]]

## Problems in Hill Climbing
1. A peak that is higher than each of its neighboring states but lower than the global maximum 
![[Pasted image 20230921101617.png]]
1. Ridges (Sequence of local maxima) is difficult for greedy algorithm to navigate
   ![[Pasted image 20230921101959.png]]
2. Plateaux (Flat area of the state) 
   Can be a flat local maximum or a shoulder

**Solution**
- Backtrack so some earlier node and try going in a different direction
- Moving in several directions at once
- Make a big jump to try to get in a new section
