import com.facebook.infer.annotation.*;


@ThreadSafe
interface I {
  void bar();
}

@ThreadSafe
class C_Sync {
  void foo(I i) {
    i.bar(); // RacerD warns here
  }
}
