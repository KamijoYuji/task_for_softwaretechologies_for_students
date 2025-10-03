package org.softwaretechnologies;

import nl.jqno.equalsverifier.EqualsVerifier;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


@SuppressWarnings("ALL")
public class EqualsHashCodeTest {
    static class A {
        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return 33;
        }
    }

    static class B {
        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            Random random = new Random();
            return random.nextInt();
        }
    }

    static class C {
        int a;

        @Override
        public boolean equals(Object o) {
            return a == ((C) o).a;
        }

        @Override
        public int hashCode() {
            return 77;
        }
    }

    static class D {
        int a;

        @Override
        public boolean equals(Object obj) {
            if(obj == null) return false;
            return obj instanceof D;
        }

        @Override
        public int hashCode() {
            return a;
        }
    }

    static class E {
        int a;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            E f = (E) o;

            return a == f.a;
        }

        @Override
        public int hashCode() {
            return a;
        }
    }

    @Test
    public void validate() {
        boolean a = EqualsVerifier.simple().forClass(A.class).report().isSuccessful();
        boolean b = EqualsVerifier.simple().forClass(B.class).report().isSuccessful();
        boolean c = EqualsVerifier.simple().forClass(C.class).report().isSuccessful();
        boolean d = EqualsVerifier.simple().forClass(D.class).report().isSuccessful();
        boolean e = EqualsVerifier.simple().forClass(E.class).report().isSuccessful();

        /*
         * Какие классы содержат верную пару equals hashCode.
         * Невалидным может быть только один из методов.
         * Встатьте нужные выражения assertTrue или assertFalse для переменных a b c d e
         * Пример:
         * assertTrue(c);
         * assertFalse(a);
         */


        // TODO: Встатьте нужные выражения assertTrue или assertFalse для переменных a b c d e чтобы тест проходил
        // ↓↓↓↓ КОД ДЛЯ ЗАМЕНЫ ↓↓↓↓
        assertTrue(a);  //equals() стандартно, hashCode() даёт равный хэш-код для одинаковых объектов
        assertFalse(b); //hashCode() при многократных вызовах у одного и того же объекта выдаёт разные результаты
        assertFalse(c); //equals() выбросит исключение при передачи в него null
        assertFalse(d); //если x.equals(y) == true, то x.hashCode() == y.hashCode() должно быть, но
        //это может нарушиться, если у объектов разные значения a
        assertTrue(e); //есть все проверки и сравнение по a в equals(), в hashCode() возврат a
        // ↑↑↑↑ КОД ДЛЯ ЗАМЕНЫ ↑↑↑↑

    }
}
