import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.Nod;
import ru.sberbank.jd.lesson02.NodImpl;


public class NodTest {
    Nod nodImpl = new NodImpl();

    @Test
    public void calculate() {
        int nod1 = nodImpl.calculate(27, 9);
        int nod2 = nodImpl.calculate(36, 64);
        int nod3 = nodImpl.calculate(364, 925);
        int nod4 = nodImpl.calculate(231, 546);
        Assert.assertEquals(nod1, 9);
        Assert.assertEquals(nod2, 4);
        Assert.assertEquals(nod3, 1);
        Assert.assertEquals(nod4, 21);
    }
}
