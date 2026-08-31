## How To Make decision Tree
1. Search for the Entropy Target
2. Find all the predictor entropy and information gain with the target
   Search Total Entropy
   Search Information Gain
3. Repeat for all predictor
4. Create the decision tree


Create Decision Tree wajib di mapping, 
![[Pasted image 20231130100320.png]]

Kalau gaada yang nge pas bisa di jebret, harus dihitung ulang entropynya




1. Pick the features that when the parent node is split it results in the **largest information gain**.
2. Stop if child nodes are pure or no improvement in class purity can be made
3. Go back to step 1 for each of the two child

#### Information Gain
Standard Criterion that is chosen for splitting in decision trees
![[Pasted image 20231130094608.png]]

#### Entropy: The expected number of bits needed to encode a randomly drawn value of Y
We can use entropy as a way to create messages of different lengths to transmit different information contents, and send information more efficiently.

- **High Entropy**
  Uniform like distribution
  Flat Histogram
  Value sampled from it are less predictable
  
- **Low Entropy**
  Distribution of variable has many peaks and valleys
  Histogram has many lows and highs
  Values sampled from it are more predictable

