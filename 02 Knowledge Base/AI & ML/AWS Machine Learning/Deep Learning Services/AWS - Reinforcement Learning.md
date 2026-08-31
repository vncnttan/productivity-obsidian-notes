[[Reinforcement Learning]]
`You have some sort of agent that "explores" some space`

Yield fast on-line performance once the space has been explored

### Q-Learning
`A specific implementation of reinforcement learning`
- s → set of environmental states 
- a → set of possible actions
- Q → value of each state / actions

Start off with Q values of 0

#### The exploration problem
`How do we efficiently explore all of the possible states?`
- Simple approach: always choose the action for the a given state with the highest Q
- Better way: introduce an epsilon term → Enable exploration for the agent
	- If epsilon > random number, just pick random action for exploration 

> → Markov Decision Process (MDPs): Modeling decision making in situations where outcomes are partly random and partly under control.

### Reinforcement Learning in Sagemaker
- DL framework with Tensorflow and MXNet
- Supports Intel Coach & Ray Rllib toolkits


Instance Type
- Recomended GPU
- Can distribute training and/or environmental rollout
- Multi-core and multi instance