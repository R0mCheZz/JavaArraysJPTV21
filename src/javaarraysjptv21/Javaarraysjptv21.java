/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraysjptv21;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Javaarraysjptv21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("----- Одномерные масивы -----");
        Random random = new Random();
        int sum = 0;
        int min = 10;
        int max = 0;
        int sum2 = 0;
        int min2 = 10;
        int max2 = 0;
        int[] nums = new int[10];
                for(int i = 0; i < nums.length; i++){
                    nums[i] = random.nextInt(10);
                }
                for(int i = 0; i < nums.length; i++){
                    System.out.printf("%3d",nums [i]);
                    sum += nums[i];
                    if(min > nums[i]) min = nums[i];
                    if(max < nums[i]) max = nums[i];
                }
                System.out.println();
                System.out.println("sum = "+sum);
                System.out.println("min = "+min);
                System.out.println("max = "+max);
                System.out.println ("----- Многомерные масивы -----");
                int [] [] nums2 = new int [10] [10];
                for(int i = 0; i < nums2.length; i++) {
                    for (int j = 0; j < nums2[i].length; j++){
                        nums2[i][j] = random.nextInt(100);
                        System.out.printf("%4d", nums2[i][j]);
                        
                        
                        sum2 = sum2 + nums2[i][j];
                        if(min2 > nums2[i][j]) min2 = nums2[i][j];
                        if(max2 < nums2[i][j]) max2 = nums2[i][j];
                                                       
                    }                   
                    System.out.println("");
                    
                    
                    
                }
                System.out.println();
                    System.out.println("sum = "+sum2);
                    System.out.println("min = "+min2);
                    System.out.println("max = "+max2);
    }
    
}
