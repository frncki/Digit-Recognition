package recognition;

public class NeuralNetwork {

    private int[] inputNeurons;
    private int[] outputNeurons;
    private int[][] weights;
    private int[] biases;

    NeuralNetwork(int[] iN, int oN, int[][] w, int[] b) {
        inputNeurons = iN;
        outputNeurons = new int[oN];
        weights = w;
        biases = b;
    }

    int evaluate() {
        int output = -100000000;
        for (int i = 0; i < outputNeurons.length; i++) {
            for (int j = 0; j < inputNeurons.length; j++) {
                outputNeurons[i] += (inputNeurons[i] * weights[i][j]);
            }
            outputNeurons[i] += biases[i];
            if(outputNeurons[i] > output){
                output = outputNeurons[i];
            }
        }

        return output;
    }
}
