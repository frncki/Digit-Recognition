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
        int maxOutcome = -100000000;
        int output = 0;
        for (int i = 0; i < outputNeurons.length; i++) {
            for (int j = 0; j < inputNeurons.length; j++) {
                outputNeurons[i] += (inputNeurons[j] * weights[i][j]);
            }
            outputNeurons[i] += biases[i];
            if(outputNeurons[i] > maxOutcome){
                maxOutcome = outputNeurons[i];
                output = i;
            }
        }
        output++;
        return (output == 10) ? 0 : output;
    }
}
