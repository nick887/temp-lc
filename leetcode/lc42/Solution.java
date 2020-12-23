package leetcode.lc42;


import java.util.*;

class Solution {
    public int trap(int[] height) {
        class Item{
            int height;
            int width;
        }
        int count=0;
        int tag=0;
        int widthtemp=1;
        Item temp;
        Stack<Item> stack=new Stack<>();
        for (int i :
                height) {
            widthtemp=1;
            if (stack.isEmpty())
            {
                Item item =new Item();
                item.height=i;
                item.width=1;
                tag=i;
                stack.push(item);
            }
            else
            {
                temp=stack.pop();
                if(i>temp.height)
                {
                    if(stack.isEmpty()) {
                        Item item=new Item();
                        item.height=i;
                        item.width=1;
                        tag=i;
                        stack.push(item);
                        continue;

                    }
                    else
                    {
                        if(i>=tag)
                        {
                            count+=(tag-temp.height)*temp.width;
                            while(!stack.isEmpty())
                            {
                                temp=stack.pop();
                                count+=(tag-temp.height)*temp.width;
                            }
                            Item item=new Item();
                            item.height=i;
                            item.width=1;
                            stack.push(item);
                            tag=i;
                        }
                        else
                        {
                            while(temp.height<i)
                            {

                                count+=(i-temp.height)*temp.width;
                                widthtemp++;
                                temp=stack.pop();
                            }
                            stack.push(temp);
                            Item item=new Item();
                            item.height=i;
                            item.width=widthtemp;
                            stack.push(item);
                        }
                    }
                }
                else
                {
                    Item item=new Item();
                    item.height=i;
                    item.width=1;
                    stack.push(temp);
                    stack.push(item);
                }
            }

        }
        return count;
    }


}