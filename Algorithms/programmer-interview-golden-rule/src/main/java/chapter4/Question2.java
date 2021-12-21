package chapter4;

public class Question2 {

    class TripleInOne {

        private int[] stack;
        private int[] stackIndex = new int[3];
        private int stackSize;

        public TripleInOne(int stackSize) {
            this.stackSize = stackSize;
            stack = new int[3 * stackSize];
            stackIndex[0] = 0;
            stackIndex[1] = 1;
            stackIndex[2] = 2;
        }

        public void push(int stackNum, int value) {
            if(stackIndex[stackNum] >= stackSize * 3) return;
            stack[stackIndex[stackNum]] = value;
            stackIndex[stackNum] += 3;
        }

        public int pop(int stackNum) {
            if (isEmpty(stackNum)) return -1;
            stackIndex[stackNum] -= 3;
            int num = stack[stackIndex[stackNum]];
            return num;
        }

        public int peek(int stackNum) {
            if (isEmpty(stackNum)) return -1;
            int num = stack[stackIndex[stackNum] - 3];
            return num;
        }

        public boolean isEmpty(int stackNum) {
            return stackIndex[stackNum] < 3;
        }

    }


}
