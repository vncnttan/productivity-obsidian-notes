How can we find the best solution while predicting the opponent's move

Games require the ability to make some **decision**, and **penalize inefficiency**.

# Kind of games
**Unpredictable opponent**: introduces uncertainty, game-playing must deal with contingency problems.

**Pruning** allows us to **ignore** portions of the search tree that **make no difference** to the final choice.


# Optimal Decisions in games
- Normal: Optimal solution to reach the goal
- Adversarial Search:
  MAX must find a contingent strategy, and assumes that MIN plays optimally -> Maximizes the worst-case outcome for **MAX**.

Terminal positions: 
- MAX Wins: Score +infinite
- MIN Wins: Score -infinite


# Minimax Strategy
Basic Idea: Choose a move with the highest minimax value (best achievable playoff against best play)


[[Alpha Beta Pruning]]


