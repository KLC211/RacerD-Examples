import com.facebook.infer.annotation.*;
import java.util.concurrent.atomic.*;

@ThreadSafe
public class AccountAtomic {

  AtomicInteger mBalance = new AtomicInteger();

  public void deposit(int amount) {
    if (amount > 0) {
      mBalance.getAndAdd(amount);
    }
  }

  public int withdraw(int amount){
    if (amount >= 0 && mBalance.get() - amount >= 0) {
      mBalance.getAndAdd(-amount);
      return mBalance.get();
    } else {
      return 0;
    }
  }
}

