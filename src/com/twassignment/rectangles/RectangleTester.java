package com.twassignment.rectangles;

/**
 * Created by alisonps on 8/15/14.
 */
public class RectangleTester {

    public static void main(String[] args) {
        int SCALE_FACTOR = 10;
        float totalArea = 0;
        float averageArea;

        //Create 5 new rectangles
        Rectangle[] rectangles = new Rectangle[5];

        //Initialize each rectangle
        for (int i = 0; i < rectangles.length; i = i + 1) {
            rectangles[i] = new Rectangle();
            rectangles[i].height = (int)(Math.random() * SCALE_FACTOR);
            rectangles[i].width = (int)(Math.random() * SCALE_FACTOR);
        }

        //Calculate average area
        for (int i = 0; i < rectangles.length; i = i + 1) {
            totalArea = totalArea + rectangles[i].area();
            System.out.println("Rectangle number " + i + " has area " + rectangles[i].area());
        }
        averageArea = totalArea/rectangles.length;

        System.out.println("The average rectangle area is " + averageArea);
    }
    
}
