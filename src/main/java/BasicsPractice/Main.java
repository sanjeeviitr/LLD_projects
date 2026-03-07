package BasicsPractice;

import java.util.*;
import java.util.stream.StreamSupport;

public class Main {

    /*
1. Even or Odd
Write a function that checks whether a number is even or odd.
 */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /*
    2. Largest of 3 numbers
Input: 3 numbers
Output: largest number.
     */

    public static int findLargestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b,c));
    }

    /*
    3. Reverse a number
     */
    public static int reverseNumber(int num) {
        int revNum = 0;
        boolean isNegative = (num<0)? true : false;
        num = Math.abs(num);
        while (num > 0) {
            int currDigit = num % 10;
            num /= 10;
            revNum = revNum * 10 + currDigit;
        }
        return (isNegative)? revNum*-1 : revNum;
    }

    /*
    4. Count digits in number
     */
    public static int countDigits(int num) {
        int count = 0;
        if(num==0) return  1;
        num = Math.abs(num);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    /*
    5. Fibonacci series (first N numbers)
     */

    public static List<Integer> fibonacciSeries(int num) {
        List<Integer> fib = new ArrayList<>();
        if(num==0) return fib;
        fib.add(0);
        if (num == 1) return fib;
        fib.add(1);
        for (int i = 2; i < num; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib;
    }

    /*
    6. Prime number check
     */
    public static boolean isPrime(int num){
        if(num==0 || num ==1) return false;
        if(num % 2 == 0) return num == 2;
        for(int i=3;i*i<=num; i+=2){
            if(num%i==0) return false;
        }
        return true;
    }

    /*
    7. Palindrome number
     */
    public static boolean isPalindrome(int num){
        return num == reverseNumber(num);
    }

    /*
    8. Factorial using function
     */
    public static long factorial(int num){
        long ans = 1;
        if(num<=1) return ans;
        for(int i=2;i<=num;i++){
            ans*=i;
        }
        return ans;
    }

    /*
    Find max element in array
     */
    public static int findMaxElement(List<Integer> list){
        if(list.isEmpty()) throw new IllegalArgumentException("There is no element in array");
        int mx = Integer.MIN_VALUE;
        for(int num : list){
            mx = Math.max(mx, num);
        }
        return mx;
    }

    /*
    10. Reverse an array
     */
    public static void reverseList(List<Integer> list){
        Collections.reverse(list);
    }

    /*
    11. Sum of array elements
     */
    public static long sumOfArrayElements(List<Integer> list){
        long sum =0;
        for(int num : list){
            sum+=num;
        }
        return sum;
    }

    /*
    12. Second largest element
     */
    public static int secondLargest(List<Integer> list){
        if(list.size() <2) throw new IllegalArgumentException("List size is less than 2");
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int num : list){
            if(num> largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num!= largest){
                secondLargest = num;
            }
        }
        if( secondLargest == Integer.MIN_VALUE) throw new IllegalArgumentException("Second largest element is not possible");
        return secondLargest;
    }

    /*
    13. Remove duplicates from array
     */
    public static List<Integer> removeDuplicates(List<Integer> list){
//        List<Integer> ans = new ArrayList<>();
//        if(list.isEmpty()) return list;
//        Collections.sort(list);
//        ans.add(list.get(0));
//        for(int i=1;i<list.size();i++){
//            if(list.get(i).equals(list.get(i-1))){
//                continue;
//            }
//            else{
//                ans.add(list.get(i));
//            }
//        }
//        return ans;

//        List<Integer> ans = new ArrayList<>();
//        if(list.isEmpty()) return list;
//        Set<Integer> set = new LinkedHashSet<>();
//        for(int num: list){
//            set.add(num);
//        }
//        for(int num : set){
//            ans.add(num);
//        }
//        return ans;

        return new ArrayList<>(new LinkedHashSet<>(list));
    }



    /*
    14. Count frequency of elements
     */
    public static Map<Integer, Integer> countFrequency(List<Integer> list){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : list){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return map;
    }

    /*
    15. Reverse a string
     */
    public static String reverse(String a){
//        StringBuilder builder = new StringBuilder();
//        for(int i=a.length()-1; i>=0;i--){
//            builder.append(a.charAt(i));
//        }
//        return builder.toString();
        if(a== null) return null;
        return new StringBuilder(a).reverse().toString();
    }

    /*
    16. Check palindrome string
     */
    public static boolean isPalindrome(String s){
        int i=0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    /*
    17. Count vowels in string
     */
    public static int countVowels(String s){
        int count =0;
        String vow = "aeiou";
        for(int i=0;i<s.length() ; i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(vow.indexOf(c) >=0){
                count++;
            }
        }
        return count;
    }

    /*
    18. Remove spaces from string
     */
    public static String removeSpaces(String s){
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(c != ' '){
//                sb.append(c);
//            }
//        }
//        return sb.toString();
        return s.replace(" ", "");
    }

    /*
    19. Find duplicate characters
     */
    public static Set<Character> duplicateCharacters(String s){
        Set<Character> set = new HashSet<>();
        Set<Character> ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                ans.add(c);
            }
            else{
                set.add(c);
            }
        }
        return ans;
    }

    /*
    20. Create a Student class
     */
    public class Student{
        private String name;
        private String id;
        private int age;

        public Student(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /*
    21. Bank Account System
     */
    public class Bank{
        private String name;
        private String branchId;
        private String address;

        public Bank(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    /*
    22. Constructor Practice
     */
    // covered in 20 and 21


    /*
    23. Method Overloading
     */
    public class Maths{

        public int sum(int a, int b){
            return a+b;
        }

        private double sum(double a, double b) {
            return a + b;
        }
    }

    /*
    24. Inheritance Example
     */
    public class Car{
        private String name;

        public void start(){
            System.out.println("Car is staring");
        }

        public void applyBreak(){
            System.out.println("Break us applied on car");
        }
    }

    public class SportsCar extends Car{
        public void accelerate(){
            System.out.println("SportsCar being accelerated");
        }
    }

    /*
    25. Abstract Class Example
     */
    public abstract class Payment{
        public abstract void doPayment();
    }

    public class UPI extends Payment{

        @Override
        public void doPayment() {
            System.out.println("Payment is done via UPI");
        }
    }

    /*
    26. Interface Example
     */
    public interface Vehicle{

        public void vehicleStart();

    }

    public class Bike implements Vehicle{

        @Override
        public void vehicleStart() {
            System.out.println("Bike is starting");
        }
    }

    public class Bus implements Vehicle{

        @Override
        public void vehicleStart(){
            System.out.println("Bus is starting");
        }
    }

    /*
    27. ArrayList Example
     */


    /*
    28. Remove duplicates using Set
     */

    /*
    29. HashMap Word Count
     */

    /*
    30. Sort numbers using Collections
     */



    public static void main(String[] args) {

        System.out.println(isEven(56));
        System.out.println(isEven(57621));
        System.out.println(findLargestNumber(42,54,12));
        System.out.println(reverseNumber(7624));
        System.out.println(reverseNumber(-7624));
        System.out.println(countDigits(7622972));
        System.out.println(fibonacciSeries(10));
        System.out.println(isPrime(111));
        System.out.println(isPrime(1118));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(12345432));
        System.out.println(factorial(5));

        Practice3 practice3 = new Practice3();
//        System.out.println(Practice2.count);
    }
}
