# Hackerrank
# Java-dataType
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

<ul><li>A byte is an 8-bit signed integer.</li>
<li>A short is a 16-bit signed integer.</li>
<li>An int is a 32-bit signed integer.</li>
<li>A long is a 64-bit signed integer.</li></ul>
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

<b>Input Format</b>

The first line contains an integer,T , denoting the number of test cases. 
Each test case, T, is comprised of a single line with an integer, T, which can be arbitrarily large or small.

<b>Output Format</b>

For each input variable n  and appropriate primitive <code>dataType</code>, you must determine if the given primitives are capable of storing it. If yes, then print:
<code>n can be fitted in:
* dataType</code>

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: 
<code>byte &lt;lt; short &lt;lt; int &lt;lt; long </code>

If the number cannot be stored in one of the four aforementioned primitives, print the line:

<code>n can't be fitted anywhere.</code><br/>
<b>Sample Input</b>

<code>
5<br/>
-150<br/>
150000<br/>
1500000000<br/>
213333333333333333333333333333333333<br/>
-100000000000000
</code><br/>
<b> Sample Output</b>

<code>-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.<br/>
-100000000000000 can be fitted in:
* long</code>


# day-of-the-week

You are given a date. Your task is to find what the day is on that date.<br>
<b>Sample Input</b>

<code>08 05 2015</code><br>
<b>Sample Output</b>

<code>WEDNESDAY</code><br>
