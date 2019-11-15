import com.facebook.infer.annotation.*;

class CounterAnnotated  implements Runnable{
    private int c = 0;

    @ThreadSafe
    public void increment() {
        c++;
    }

    @ThreadSafe
    public void decrement() {    
        c--;
    }

    @ThreadSafe
    public int getValue() {
        return c;
    }
    
    @Override
    public void run() {
        //incrementing
        this.increment();
        System.out.println("Value for Thread After increment " 
        + Thread.currentThread().getName() + " " + this.getValue());
        //decrementing
        this.decrement();
        System.out.println("Value for Thread at last " 
        + Thread.currentThread().getName() + " " + this.getValue());        
    }
}
