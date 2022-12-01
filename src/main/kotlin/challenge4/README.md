# 🧠 Challenge #4

Challenge done during **Section 6: Loops, and the If, When, and Try/Catch Expressions**.

## 🎯 Tasks
1. Use a range to print out the numbers from 5 to 5000 in steps of 5.
2. Use a range to print out the numbers from -500 to 0.
3. Using a range, print the first 15 numbers in the Fibonacci sequence.
4. Without overwriting the starting code, add changes to it which will make it print the following:
   ```shell
   1
   11
   100
   99
   98
   2
   ```

   Starting code:

   ```kotlin
   for (i in 1..5) {
       println(i)

       for (j in 11..20) {
           println(j)

           for (k in 100 downTo 90) {
               println(k)
           }
       }
   }
   ```
5. Declare a variable called `num` (`Int`) and assign it any value you choose. Also declare a variable called `dnum` (`Double`) and do the following:
   - in one expression:
     - if `num` > 100, assign `dnum` -234.567
     - if `num` < 100, assign `dnum` 4444.555
     - if `num` == 100, assign `dnum` 0.0
   - print the value of `dnum`.
