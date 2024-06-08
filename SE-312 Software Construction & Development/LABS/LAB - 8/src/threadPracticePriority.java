class threadPracticePriority extends Thread {
    public void run(){
        System.out.println("Running Priority-wise...");
        try {
            Thread.currentThread().sleep(00);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Running thread name:"+Thread.currentThread().getName());
        System.out.println("Running thread priority:"+ Thread.currentThread().getPriority());
    }
    public static void main(String args[]) throws InterruptedException {
        threadPracticePriority p1 = new threadPracticePriority();
        threadPracticePriority p2 = new threadPracticePriority();
        threadPracticePriority p3 = new threadPracticePriority();

        p1.setPriority(1);
        p2.setPriority(5);
        p3.setPriority(10);

        p1.start();
        p2.start();
//        p3.stop();

    }
}
