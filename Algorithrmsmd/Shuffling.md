# Shuffling
## 作用
> 将原有数组进行均匀打乱  
> 且在线性时间内


## code
```java
class Shuffling{
    void shuffling(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int index=random(1,i-1);//生产1---i-1的随机数
            swap(nums,i,index);//将两者互换
        }
    }
}
```