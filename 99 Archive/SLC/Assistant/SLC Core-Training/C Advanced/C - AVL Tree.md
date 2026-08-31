AVL Tree is a self-balancing [[BST Tree]]

AVL Tree height = The maximum height of left/right child + 1
AVL Tree balance factor = Left child's height - Right's child height

Functions:
- max
- getHeight
- newNode
- rightRotate
- leftRotate
- insertVal
- insertMusic
- inOrder
- view

[[C - AVL Tree Rotation Code]]

Balance Factor harus -1 0 atau 1

### AVL Insertion
1. Left Rotation (balance factor > 1
   ![[Pasted image 20230101114939.png]]
2. Right Rotation (balance factor < -1)
   ![[Pasted image 20230101114928.png]]
3. Left-Right Rotation (balance factor > 1, but the value is bigger than the node above it)
   ![[Pasted image 20230101114841.png]]
4. Right-Left Rotation (balance factor < -1, but the value is smaller than the node above it)
   ![[Pasted image 20230101114916.png]]

### AVL Deletion
Similar to [[BST Tree]] Deletion, but with balance checking