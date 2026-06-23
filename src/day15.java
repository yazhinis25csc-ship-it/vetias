public class day15{
    static void main() throws InterruptedException{
        Runnable chefTask=()->{
            String[] items={"coffee","tea","juice"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Cooking item: " + items[i]);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread =new Thread(chefTask,"chef-Thread");
        chefThread.start();
        chefThread.join();
    }
}
