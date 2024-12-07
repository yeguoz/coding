package com.test1.demo1;

public class BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};

        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);
        Block[] arrBlock = {b1,b2,b3};
        int num = 66;
        int blockIndex = getBlcok(arrBlock,num);
        if (blockIndex == -1){
            System.out.println("不存在这个元素");
        }else {
            int resultIndex = getIndex(arr,arrBlock,blockIndex,num);
            if (resultIndex == -1){
                System.out.println("该元素不存在");
            }else {
                System.out.println("该元素的索引是："+resultIndex);
            }
        }
    }

    private static int getIndex(int[] arr,Block[] arrBlock,int blockIndex,int num) {
        for (int i = arrBlock[blockIndex].getStartIndex(); i <= arrBlock[blockIndex].getEndIndex() ; i++) {
            if (arr[i]==num)
                return i;
        }
        return -1;
    }

    private static int getBlcok(Block[] arrBlock,int num) {
        for (int i = 0; i < arrBlock.length; i++) {
            if (num<arrBlock[i].getMax())
                return i;
        }
        return -1;
    }
}


class Block{
    private int max;
    private int startIndex;
    private int endIndex;

    public Block(){ }
    public Block(int max,int startIndex,int endIndex){
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax(){
        return max;
    }

    public void setStartIndex(int startIndex){
        this.startIndex = startIndex;
    }

    public int getStartIndex(){
        return startIndex;
    }

    public void setEndIndex(int endIndex){
        this.endIndex = endIndex;
    }

    public int getEndIndex(){
        return endIndex;
    }
}