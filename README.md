# ciphercaesar

Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
Function Description

Complete the caesarCipher function in the editor below. It should return the encrypted string.

caesarCipher has the following parameter(s):

s: a string in cleartext
k: an integer, the alphabet rotation factor
Input Format

The first line contains the integer, n, the length of the unencrypted string.
The second line contains the unencrypted string, s.
The third line contains k, the number of letters to rotate the alphabet by.
Output Format

For each test case, print the encoded string.
