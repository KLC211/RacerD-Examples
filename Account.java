import com.facebook.infer.annotation.*;

@ThreadSafe
public class Account {

  int mBalance = 0;

  public void deposit(int amount) {
    if (amount > 0) {
      mBalance += amount;
    }
  }

  public int withdraw(int amount){
    if (amount >= 0 && mBalance - amount >= 0) {
      mBalance -= amount;
      return mBalance;
    } else {
      return 0;
    }
  }
}

