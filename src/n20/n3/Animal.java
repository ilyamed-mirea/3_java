package n20.n3;

import java.io.Serializable;

public interface Animal<V> extends Serializable {
    void eat(V v);
}
