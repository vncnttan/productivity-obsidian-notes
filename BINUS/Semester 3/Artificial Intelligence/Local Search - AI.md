
Agents to search something efficiently

# Introduction to Algorithm
---
Designing algorithm for solving a problem efficiently
example: *finding the shortest path in a graph*

# Computational Optimization Technique
- Convex Programming 
- Iterative Method
- Heuristic (*prediction value, etc.*)
   Examples: SLD (Straight Line Distance)
   Heuristic should be predicting distances to the goal so it can help guide where to take the paths

# Local Search
---
Algorithms operate using a single current node (rather than multiple paths) and generally move only to neighbors of that node.

Greedy algorithm because there is no structure in the algorithm, past nodes are not retained.

Local search are useful for solving pure optimization problems. But we usually are stuck with the **local optimum** solution not the **global optimum**. 

Example: 
**![[Hill Climbing]]**
- Simulated Annealing
- Beam Search
- Genetic Algorithm

The aim of the optimization algorithm is to find the highest peak (global maximum).
For example in [[Machine Learning - AI]] is in tweaking **hyperparameters**

Complete algorithm: finds a goal if it exists
Optimal algorithm: finds the global maximum / minimum


