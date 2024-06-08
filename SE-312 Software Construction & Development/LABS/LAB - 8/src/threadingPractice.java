class threadingPractice extends Thread{
    public void run(){
        System.out.println("Running...");
    }

    public static void main(String args[]){
        threadingPractice t1 = new threadingPractice();
        threadingPractice t2 = new threadingPractice();
        System.out.println("Thread 1 name:"+t1.getName());
        System.out.println("Thread 2 name:"+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Syed Muhammad Zaid");
        System.out.println("Thread 1 new name:"+t1.getName());
    }
}