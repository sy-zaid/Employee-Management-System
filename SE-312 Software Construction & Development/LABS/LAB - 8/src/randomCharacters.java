public class randomCharacters extends Thread {
    // Override the run() method
    public void run() {
        // Loop through alphabets from 'A' to 'Z'
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            // Print the current alphabet
            System.out.println(alphabet);
            try {

                int randomDelay = (int) (Math.random() * 901) + 100;
                Thread.sleep(randomDelay);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        randomCharacters alphabetThread = new randomCharacters();
        alphabetThread.start();
    }
}