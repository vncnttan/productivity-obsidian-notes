**Vincent Tanjaya - 2602128346**

Optimal Binary Search Tree (OBST) adalah struktur data yang dirancang untuk mencari dynamic key dengan efektif. Penataan tempat simpul BST akan dibuat sedemikian rupa sehingga biaya rata-rata pencarian, penambahan, dan penghapusan elemen menjadi minimal. OBST dapat diwujudkan dengan membuat pohon dan di setiap simpul mewakili sebuah kunci dan subpohon di kiri dan kanan sebuah simpul berisi kunci yang lebih kecil dan lebih besar. Dynamic programming biasanya digunakan untuk membangun OBST yang optimal.

1. Construct optimal BST
```
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def optimalBST(root, i, j, prefix, key_names, d_names):
    if i == j:
        return TreeNode(prefix + i)
    else:
        root_node = TreeNode(prefix + root[i][j])
        root_node.left = optimalBST(root, i, root[i][j] - 1, prefix + root[i][j], key_names, d_names)
        root_node.right = optimalBST(root, root[i][j] + 1, j, prefix + root[i][j], key_names, d_names)
        return root_node

def printTree(node, level=0):
    if node != None:
        printTree(node.right, level + 1)
        print(' ' * 4 * level + '->', node.value)
        printTree(node.left, level + 1)
```

1. Const and structure of an optimal binary search tree
![[Pasted image 20231130221427.png]]
Maka cost = 3, 12

![[Pasted image 20231130222542.png]]
3. Asymptotic running time dari OBST tidak akan berubah dikarenakan pada line 5 sampai 14 terdapat 3 nested loop
   
   Hal ini membuat time complexity menjadi O(n^3) sebagai waktu yang memakan terlama, sehingga yang diambil hanya n^3 saja, dan hal ini tidak berubah sesuai dengan Asymptotic Running Time Optimal Binary Search Tree.
