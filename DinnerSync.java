import com.facebook.infer.annotation.*;

@ThreadSafe
public class DinnerSync {
  private int mTemperature;
  private final Object lock = new Object();

  public void makeDinner() {     
    boilWater();
  }

  private void boilWater() {
    synchronized (lock){
      mTemperature = 100; // unprotected write.
    }
  }
}
