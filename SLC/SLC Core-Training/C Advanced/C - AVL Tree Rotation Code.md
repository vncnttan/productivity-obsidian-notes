```cpp
struct Node *rightRotate(struct Node *y){
    struct Node *x = y->left;
    struct Node *b = x->right;
  
    y->height = max(getHeight(y->left), getHeight(y->right)) + 1;
    x->height = max(getHeight(x->left), getHeight(x->right)) + 1;
    return y;
}
  
struct Node *leftRotate(struct Node *y){
    struct Node *x = y->right;
    struct Node *b = x->left;
  
    y->height = max(getHeight(y->left), getHeight(y->right)) + 1;
    x->height = max(getHeight(x->left), getHeight(x->right)) + 1;
    return y;
}
```

``` cpp
// Inside the Insert Function
    int bFact  = getBalFactor(root);
    int lexico = strcmp(temp->name, root->data->name);
    // Left Rotation
    if(bFact < -1 && lexico > 0){
        return leftRotate(root);
    }
  
    // Right Rotation
    if(bFact > 1 && lexico < 0){
        return rightRotate(root);
    }
  
    // Left-Right Rotation
    if(bFact < -1 && lexico < 0){
        root->left = leftRotate(root->left);
        return rightRotate(root);
    }
  
    // Right-Left Rotation
    if(bFact > 1 && lexico > 0){
        root->right = rightRotate(root->right);
        return leftRotate(root);
    }
```
