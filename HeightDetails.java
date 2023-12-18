import java.util.*;

public class HeightDetails {
    String[] name;
    double[] height;
    int size;

    static Scanner input = new Scanner(System.in);

    HeightDetails(int n){
        size = n;
        height = new double[size];
        name = new String[size];
    }

    void inputHeights(){
        for(int i=0; i<size; i++){
            System.out.println("Enter student's name:");
            name[i] = input.nextLine();
            System.out.println("Enter student's height in inches:");
            height[i] = input.nextDouble();
        }
    }

    double findAverage(){
        double total = 0;
        for(double h: height){
            total += h;
        }
        return total/size;
    }

    void greaterThanAverage(){
        double averageHeight = findAverage();
        System.out.println("Average height: "+averageHeight);
        System.out.println("Students with a height greater than the average: ");
        for(int i=0; i<size; i++){
            if(height[i]>averageHeight){
                System.out.println(name[i]);
            }
        }
    }
 
    void lessThanAverage(){
        double averageHeight = findAverage();
        System.out.println("Average height: "+averageHeight);
        System.out.println("Students with a height less than the average: ");
        for(int i=0; i<size; i++){
            if(height[i]<averageHeight){
                System.out.println(name[i]);
            }
        }
    }

    public static void main(String[] args){
        int n= 10;
        HeightDetails obj = new HeightDetails(n);
        obj.inputHeights();
        obj.lessThanAverage();
        obj.greaterThanAverage();
    }
}
