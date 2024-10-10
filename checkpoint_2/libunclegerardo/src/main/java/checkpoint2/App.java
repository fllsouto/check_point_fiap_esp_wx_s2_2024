package checkpoint2;

public class App {
    public static void main(String[] args) {
        NucleotideoRandomGenerator generator = new SimpleNucleotideGenerator();
        
        // Exemplo de geração de uma sequência de 10 nucleotídeos
        String randomSequence = generator.generate(10);
        System.out.println("Generated sequence: " + randomSequence);
    }
}
