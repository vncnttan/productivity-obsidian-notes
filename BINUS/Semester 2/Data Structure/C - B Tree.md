One node have two data in them

![[Pasted image 20230510134550.png]]

B tree has an order of **m**
- Every node has at most m children
- Every node has at least m/2 children (except root)
- Root has at least 2 children if it is not a leaf

- None leaf node with k children contain k-1 keys


### Syarat 2-3 Tree
1. 2-node: 1 data 2 anak (kiri, tengah)
   3-node: 2 data 3 anak (kiri tengah kanan)
2. Dari kiei ke kanan semakin besar termasuk anaknya juga
### Operations: Insertion
- Search for the position until you reach the leaf
- If the leaf is 2-node, simply put it there
- If the leaf is 3-node, sort:
  1. Yang tengah: Parent
  2. Yang paling kecil: Anak kiri
  3. Yang paling besar: Anak kanan

### Operations: Deletions
Pengganti: Anak kiri paling banyak (kalau key kanan yang dihapus, maka diganti dengan anak tengah karena tengah adalah kiri dari kanan)
1. Cari pengganti
2. Jika yang diganti:
   - Parent 3-Node: 
       - Sibling 3-Node: Get one value from it
   - 2-Node: 
      - Sibling = 3-node: Rotate
      - Sibling = 2-node: Merge dengan satu data dari parent   