package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String  scores [];
        /*scores = new String[]{"72   56   90", "54   45   92", "62   73   82"};
        Solution.Correlation(scores);*/
       /* int a[] = {10,9,8,7,3,2,1};  //1,2,3,7,8,9,10
        int b1[] = {1,9,2,7,3,4,5}; //1,2,3,4,5,7,9
        int x[] ={4,4,4,3,4,4,3,1,1};
        int s1[]= {1,2,3,-6};
        int s2[]= {-1,-2,-3,-4};
        int miss[]={1,2,3,4,6,7,8,9,10};
        int miss1[]={-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        int s[]={5,4,3,1,2};
        Integer []mn = {2, null, 4, null, 6, null, 8,null,null,9};
        Integer [] n= {3, 5, 7,9,9};
        int m1 [] ={1,2,8,9};
        int m2[]={5,6,7,10,12,14};
        String rev = "This is my project";
        String abc= "ABC";*/
        //Bubble sort call

    /*    BubbleSort b = new BubbleSort();
        b.sorting(a);

        System.out.println("--------------------------------------");
        b.sorting(b1);
*/
        //Selection sort calls

       /* SelectionSort s = new SelectionSort();
         s.sortingSelection(a);
        s.sortingSelection(b1);
*/

        // Insertion sort calls

     /*   InsertionSort i = new InsertionSort();
        i.sortIntsert(a);
        i.sortIntsert(b1);
*/

        //Merge sort logic is here

/*        MergeSort m = new MergeSort(a);
        m.mergeSort(0,a.length-1);
        m.priintData();*/

        // Quick Sort logic
      /*  QuickSort q = new QuickSort(a);
        q.quickSort(0,(a.length-2));
        q.printData();*/

        // Summation of arrays

       /*     SummationArray s = new SummationArray();
            s.summationx(a,7);
            s.summationx(b1,9);
*/

        //Majority element

/*        MajorityElement m = new MajorityElement();
        m.majorityElement(x);*/

    // Threading Example
/*

        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new ThreadingSample(),"t");
        Thread t1 = new Thread(new ThreadingSample(),"t1");
        Thread t2 = new Thread(new ThreadingSample(),"t2");
        */
/*t.setPriority(1);
        t1.setPriority(5);
        t2.setPriority(10);*//*


        t.start();

        t1.start();
        t2.start();
        System.out.println("Total time taken is   "+ (System.currentTimeMillis()-startTime));
*/

        // Odd number occurrences condition all other numbers in the list should occure only at once.

/*
        OddNumberOccurrence o =  new OddNumberOccurrence();
        o.findOddOccurrence(x);
*/

       // Continuous sum of the numbers

      /*  ContinuousSum c  = new ContinuousSum();
        c.findContinuousSum(s1);
        c.findContinuousSum(s2);*/

      /* // Find the missing number
        FindMissing m = new FindMissing();
        m.missingNumber(miss);
        m.missingNumber(miss1);*/

   /*     SearchElementWithRotation sea  = new SearchElementWithRotation();
        sea.searchEle(a,0,a.length-1,1);
*/

        // Merge Sorted Arrays
/*

        MergeTwoArrays m = new MergeTwoArrays(n,mn);
        m.merge();
        m.printArray();
*/

        // Median of two sorted arrays

      /*  MedianOfTwoElements med = new MedianOfTwoElements();
        med.findMedian(m1,m2);
*/
        // Reverse the arrays/String

            /*ReverseArray r = new ReverseArray();
            r.reverseA(m2);
            r.reverseA(rev);*/

      /*      RotateArray rt = new RotateArray(m2);
            rt.rotate(2);
            rt.printArray();*/

        // String permutations
        /*PermutationString p = new PermutationString(abc);
        p.permute(abc,0,abc.length()-1);*/

        // Graph implementation


	// write your code here
       /*String str = "My name is Harsh";
        boolean cAt [] = new boolean[256];
        int arr[]={1,2,1,3,1,3,4,5,6};
        BinaryConversion bc = new BinaryConversion();
        BinaryGap bg = new BinaryGap();
        bg.solution(51712);
*/
      //  bc.solution(1041);
       /* char [] s = str.toCharArray();
        int check =0;

        System.out.println(s[0]);
        cAt[s[0]]=true;
        for (int i=0;i<str.length();i++){
            int val = str.charAt(i)-'a';
            if((check & (1 << val)) > 0){
                System.out.println("Not all unique chars"+check);
                break;
            }
            check |= (1<<val);
            System.out.println(check);
        }*/

 //Duplicate array element logic
      /*StringReverse sr = new StringReverse();
        sr.findDuplicate(arr);
*/

  /*   CountFiles cf = new CountFiles();
      cf.countFilesinServer();
*/
    }
}
