# 优先队列
## 1 平衡二叉树
1. 平衡二叉树是除了末尾节点其他节点都有子节点的树
2. 平衡二叉树可以用数组表示,数组下标为0的单位不使用
3. 每个下标为k的节点子节点坐标是2k，2k+1
4. 每个下标为k子节点的父节点是k/2

## 2 二叉堆的添加与删除
### 2.1性质
二叉堆的每个父节点值都比子节点大
### 2.2 添加
添加函数是swim,添加节点插入数组尾端
```java
class add {
    public void swim(int a) {
        while (a>1&&less(a/2,a)) {
            exch(a / 2, a);
            a=a/2;
        }
            
    }
}
```
### 2.3 删除
首先将删除元素与尾部元素互换，然后将数组长度-1，最后将头部元素sink

```java
class del {
    public void sink(int k,int N) {
        while (2 * k < N) {
            int j = 2 * k;
            if (j < N && less(j, j + 1))
                j++;
            if (!less(k, j))
                break;
            exch(k, j);
            k = j;
        }
    }
}
```