package recognition;

import java.util.Scanner;

public class Stage2 {

    public static void main(String[] args) {
        int[][] weights = {
                {-1, 1, -1, -1, 1, -1, -1, 1, -1, -1, 1, -1, -1, 1, -1}, //1
                {1, 1, 1, -1, -1, 1, 1, 1, 1, 1, -1, -1, 1, 1, 1},       //2
                {1, 1, 1, -1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1},       //3
                {1, -1, 1, 1, -1, 1, 1, 1, 1, -1, -1, 1, -1, -1, 1},     //4
                {1, 1, 1, 1, -1, -1, 1, 1, 1, -1, -1, 1, 1, 1, 1},       //5
                {1, 1, 1, 1, -1, -1, 1, 1, 1, 1, -1, 1, 1, 1, 1},        //6
                {1, 1, 1, -1, -1, 1, -1, -1, 1, -1, -1, 1, -1, -1, 1},   //7
                {1, 1, 1, 1, -1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1},         //8
                {1, 1, 1, 1, -1, 1, 1, 1, 1, -1, -1, 1, 1, 1, 1},        //9
                {1, 1, 1, 1, -1, 1, 1, -1, 1, 1, -1, 1, 1, 1, 1}};       //0

        int[] biases = {6, 0, 0, 2, 0, -1, 4, -2, -1, -1};

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String thirdLine = scanner.nextLine();
        String fourthLine = scanner.nextLine();
        String fifthLine = scanner.nextLine();

        Grid inputNeurons = new Grid(firstLine + secondLine + thirdLine + fourthLine + fifthLine);
        NeuralNetwork neuralNetwork = new NeuralNetwork(inputNeurons.getGrid(), 10, weights, biases);

        System.out.println("Input grid:");
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);
        System.out.println(fifthLine);
        System.out.println("This numer is " + neuralNetwork.evaluate());
    }
}
