package nao.cycledev.rxjava;

import io.reactivex.Observable;
import org.junit.Assert;
import org.junit.Test;

public class RxJavaUnitTest {

    String result="";

    // Simple subscription to a fix value
    @Test
    public void returnAValue(){
        result = "";
        Observable<String> observer = Observable.just("Hello"); // provides data
        observer.subscribe(s -> result = s); // Callable as subscriber
        Assert.assertTrue(result.equals("Hello"));
    }
}
