# CSC303-FA23-Program-11-1

Modify the MyHashMap class to allow the user to choose whether a linear probe or a quadratic probe is used in collision management.

- Create a quadraticProbe(int index, K key) method
- Modify the constructors to allow an integer value (i.e., 0 or 1) to be passed in to specify a linear or quadratic probe be used.
- Modify getHashIndex(K key) to use the new parameter to specify whether a linear or quadratic probe is used.

Write test code to test and verify that the appropriate probe is used and that the probe method is working correctly.

The test program should use the sp500.csv file, which provides stock symbols and prices that can be loaded into a hashmap for testing.
