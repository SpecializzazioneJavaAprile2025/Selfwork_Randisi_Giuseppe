package Esercizio3;

import java.util.Objects;


public class RubricaKey {
    String cf;
    public RubricaKey(String cf) {
        this.cf = cf;
    
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    RubricaKey other = (RubricaKey) obj;
    return Objects.equals(cf, other.cf);
    }

    @Override
    public int hashCode() {
    return Objects.hash(cf);
    }
}
