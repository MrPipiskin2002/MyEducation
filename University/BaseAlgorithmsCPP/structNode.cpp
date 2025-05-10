#include <iostream>
using namespace std;

struct tree
{
    int key;
    int index;
    tree* left;
    tree* right;
    tree(int key, int index): key(key), index(index), left(nullptr), right(nullptr) {}
};

tree* addRoot(tree* root, int key, int index)
{
    if(!root)
    {
        return new tree(key, index);
    }
    if(key>root->key){root->left = addRoot(root->left, key, index);}
    if(key<root->key){root->right = addRoot(root->right, key, index);}
    return root;
};

tree* search(tree* root, int x)
{
    if(!root || x==root->key){return root;}
    if(x>root->key){return search(root->left, x);}
    if(x<root->key){return search(root->right, x);}
}

int main()
{
    int* arr = new int[10]{2, 4, 5, 1, 3, 9, 5, 0, 8, 6};
    tree* rt = nullptr;

    for (int i = 0; i<10; i++)
    {
        rt = addRoot(rt, arr[i], i);
    }

    int x = 12;
    tree* find = search(rt, x);
    if (find)
    {
        cout << find->key << " " << find->index;
    }
    return 0;
}